package model;

public class ListaLigada<T> {
  private Celula primeira;
  private Celula ultima;
  private int total;

  public void adiciona(T object) {
    if(total == 0) {
      primeira = new Celula(object);
      ultima = primeira;
      primeira.setProxima(ultima);
      ultima.setProxima(ultima);
      total++;
      return;
    }
    Celula ultimaCelula = ultima;
    Celula novaCelula = new Celula(object);

    ultimaCelula.setProxima(novaCelula);
    novaCelula.setProxima(novaCelula);
    ultima = novaCelula;
    total++;
  }

  public void adiciona(int posicao, T object) {
    if(total == 0) {
      primeira = new Celula(object);
      ultima = primeira;
      primeira.setProxima(ultima);
      ultima.setProxima(ultima);
      total++;
      return;
    }

    if(posicao > total) {
      Celula novaCelular = new Celula(object);
      ultima = novaCelular;
      total++;
      return;
    }

    Celula itCelula = primeira;

    for(int it = 0; it < posicao - 1; it++) {
       itCelula = itCelula.getProxima();
    }
    Celula celulaSeguinte = itCelula.getProxima();
    Celula novaCelula = new Celula(object);

    itCelula.setProxima(novaCelula);
    novaCelula.setProxima(celulaSeguinte);
    total++;
  }

  public T pega(int posicao) {
    Celula itCelula = primeira;

    for(int it = 0; it < posicao - 1; it++) {
      itCelula = itCelula.getProxima();
    }
    return (T) itCelula.getObject();
  }

  public void remove(int posicao) {
    if(posicao <= 1) {
      primeira = primeira.getProxima();
    }
    else if(posicao >= total) {
      Celula itCelula = primeira;
      for (int i = 0; i < total - 2; i++) {
          itCelula = itCelula.getProxima();
      }
      itCelula.setProxima(itCelula);
      ultima = itCelula;
    }
      Celula itCelula = primeira;

      for(int it = 0; it < posicao - 2; it++) {
        itCelula = itCelula.getProxima();
      }

      itCelula.setProxima(itCelula.getProxima().getProxima());
      total--;
  }

  public int tamanho() {
      return total;
  }

  public boolean contem(T object) {
    Celula itCelula = primeira;

    for(int it = 0; it < total - 1; it++) {

      if(itCelula.getObject().equals(object)) {
        return true;
      }
      itCelula = itCelula.getProxima();
    }
    return false;
  }

  public void adicionaNoComeco(T object) {
    Celula novaCelula = new Celula(object);

    novaCelula.setProxima(primeira);
    primeira = novaCelula;
    total++;
  }

  public void removeDoComeco() {
    primeira = primeira.getProxima();
    total--;
  }

  public void removeDoFim() {
    Celula itCelula = primeira;
    for(int it = 0; it < total -2; it++) {
      itCelula = itCelula.getProxima();
    }
    itCelula.setProxima(itCelula);
    ultima = itCelula;
    total--;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();

      Celula celula = primeira;

    for(int i = 0; i < total -1; i++) {
      sb.append(celula.getObject().toString() + ", " );
      celula = celula.getProxima();
    }
    sb.append("e ");
    sb.append(ultima.getObject().toString());

    return sb.toString();
  }
}
