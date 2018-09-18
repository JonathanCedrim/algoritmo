package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhado <T> {
    private List<List<Associacao>> tabela = new ArrayList<List<Associacao>>();

    public MapaEspalhado() {
        for(int it = 0; it < 100; it++) {
            this.tabela.add(new LinkedList<Associacao>());
        }
    }

    public void adicionar(String chave, T object) {
        List<Associacao> lista = this.tabela.get(calculaIndex(chave));

        if(contemChave(chave)) {
            lista.remove(chave);
        }
        lista.add(new Associacao(chave, object));
    }

    private int calculaIndex(String chave) {
        return Math.abs(chave.hashCode()) % this.tabela.size();
    }

    public boolean contemChave(String chave) {
        int index = this.calculaIndex(chave);

        List<Associacao> lista = this.tabela.get(index);

        for(int it = 0; it < lista.size(); it++) {
            Associacao associacao = lista.get(it);

            if(associacao.getChave().equals(chave)) {
                return true;
            }
        }
        return false;
    }

    public void remove(String chave) {
        int index = this.calculaIndex(chave);

        List<Associacao> lista = this.tabela.get(index);

        for(int it = 0; it < 100; it++) {
            Associacao associacao = lista.get(it);

            if (associacao.getChave().equals(chave)) {
                lista.remove(associacao);
            }
        }
        new Exception("Chave não encontrada");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(List<Associacao> listaAssociacao: this.tabela) {
            for(Associacao associacao: listaAssociacao) {
                sb.append(associacao.toString() + ", ");
            }
        }
    return sb.toString();
    }
}
