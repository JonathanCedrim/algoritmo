package test;

import model.MapaLista;
import model.Carro;

public class MapaListaTest {

    public static void main(String [] args) {
        MapaLista lista = new MapaLista();

        lista.adicionar("PSY 0404", new Carro("Camaro Amarelo"));

        System.out.println(lista.toString());

        lista.remove("PSY 0404");

        System.out.println(lista.toString());

        lista.adicionar("PSY 0404", new Carro("Camaro Vermelho"));

        System.out.println(lista.toString());
    }
}
