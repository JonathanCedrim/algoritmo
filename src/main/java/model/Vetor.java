package model;


public class Vetor<T> {
    private Object[] lista = new Object[100];
    private int tamanho = 0;

    public void adicionar(T objeto) {
        garanteEspaco();
        lista[tamanho] = objeto;
        tamanho++;
    }

    public void adicionar(int posicao, T objeto) {
        garanteEspaco();
        if(posicao <= 0) {
            adicionar(1, objeto);
            return;
        }

        if(posicao > tamanho) {
            lista[tamanho] = objeto;
            tamanho++;
            return;
        }

        for(int i = tamanho; i >= posicao-1; i--) {
            lista[i + 1] = lista[i];
        }
        lista[posicao - 1] = objeto;
        tamanho++;
    }

    public Object pega(int posicao) {
        if(posicao < 0 || posicao > tamanho) {
            return "Posicao invalida";
        }
        return lista[posicao - 1];
    }

    public void remove(int posicao) {
        for(int i = posicao - 1; i < tamanho; i++) {
            lista[i] = lista[posicao++];
        }
        tamanho--;
    }

    public void remove(int posicao, T object) {

    }

    public boolean contem(T objeto) {
        for (int i = 0; i < tamanho; i++) {
            if(objeto.equals(lista[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T object) {
        for(int i = 0; i < tamanho; i++) {
            if(object.equals(lista[i])) return i +1;
        }
        return -1;
    }

    public int lastIndexOf(T object) {
        int ultimo = 0;
        for(int i = 0; i < tamanho; i++) {
            if(object.equals(lista[i])) {
                ultimo = i;
            }
        }
        return ultimo + 1;
    }

    public int tamanho () {
        return tamanho;
    }

    public String toString() {
        if(this.tamanho > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < tamanho - 2; i++) {
                sb.append(lista[i].toString() + ", ");
            }
            if(lista[1] != null) {
                sb.append(lista[tamanho - 2].toString() + " e ");
            }
            sb.append(lista[tamanho - 1].toString());
            sb.append("]");

            return sb.toString();
        }
        return "Lista Vazia";
    }


    public void clear() {
        this.lista = new Object[100];
        this.tamanho = 0;
    }

    private void garanteEspaco() {
        if (tamanho == lista.length) {
            Object[] listaAux = new Object[lista.length * 2];

            for (int i = 0; i < lista.length; i++) {
                listaAux[i] = lista[i];
            }
            this.lista = listaAux;
        }
    }
}
