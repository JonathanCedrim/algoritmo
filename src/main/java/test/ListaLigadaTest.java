package Teste;

import model.Aluno;
import model.ListaLigada;

public class ListaLigadaTest {

    public static void main(String [] args) {
        ListaLigada<Aluno> listaLigada = new ListaLigada();

        listaLigada.adiciona(new Aluno("Adriano"));
        listaLigada.adiciona(new Aluno("Maycom"));
        listaLigada.adiciona(new Aluno("Lucas"));
        listaLigada.adiciona(new Aluno("Kaique"));

        System.out.println(listaLigada.toString());
        System.out.println("Tamanho: " + listaLigada.tamanho());


        listaLigada.adiciona(11, new Aluno("Jonathan X"));


        System.out.println(listaLigada.toString());
        System.out.println("Tamanho: " + listaLigada.tamanho());



        System.out.println("Pega posicao 3 : " + listaLigada.pega(3).toString());

        System.out.println(listaLigada.toString());

        listaLigada.remove(-5);

        System.out.println("Lista com membro removido : " + listaLigada.toString());

        listaLigada.adicionaNoComeco(new Aluno("Vitor"));

        System.out.println("Adiciona do começo: " + listaLigada.toString());
        System.out.println("Contem: " + listaLigada.contem(listaLigada.pega(1)));
    }
}
