package model;

import java.util.ArrayList;

public class MapaLista<T> {

    private ArrayList<Associacao> lista = new ArrayList<Associacao>();

    public void adicionar(String placa, T object) {
        if(contemChave(placa)){
            new Exception("Placa já utilizada").printStackTrace();
            return;
        }
	    lista.add(new Associacao(placa, object));
    }

    public Object pega(String placa) {
        for(Associacao associacao: lista) {
            if(associacao.getChave().equals(placa)){
                return associacao.getObject();
            }
	}
	new Exception("Placa não encontrada").printStackTrace();
	return null;
    }

    public void remove(String placa) {
        if(contemChave(placa)) {
            for(int it = 0; it < lista.size(); it++) {
                Associacao associacao = lista.get(it);
                if(associacao.getChave().equals(placa)) {
                    lista.remove(it);
                }
            }
        }
    }

    public boolean contemChave(String placa) {
        for(Associacao associacao: lista) {
            if(associacao.getChave().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
