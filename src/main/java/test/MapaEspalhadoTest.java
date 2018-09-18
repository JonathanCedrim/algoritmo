package test;

import model.Carro;
import model.Cores;
import model.MapaEspalhado;

public class MapaEspalhadoTest {

    public static void main(String [] args) {
        MapaEspalhado<Cores> paleta = new MapaEspalhado();

        paleta.adicionar("#FF0000", new Cores("Red"));
        paleta.adicionar("#00FF00", new Cores("Green"));
        paleta.adicionar("#0000FF", new Cores("Blue"));

        System.out.println(paleta.toString());
    }
}
