package Teste;

import model.Aluno;
import model.Cronometro;
import model.Vetor;

import java.util.ArrayList;

public class VetorTest {
    public static void main(String [] args) {
        Vetor<Aluno> lista = new Vetor<Aluno>();
        Cronometro cronometro = new Cronometro();

        Aluno a1 = new Aluno("Jonathan");
        Aluno a2 = new Aluno("Adriano");
        Aluno a3 = new Aluno("Maycom");
        Aluno a4 = new Aluno("Kaique");
        Aluno a5 = new Aluno("Wanessa");
        Aluno a6 = new Aluno("Lucas");
        Aluno a7 = new Aluno("Felipe");

        lista.adicionar(a1);
        lista.adicionar(a2);
        lista.adicionar(a3);
        lista.adicionar(a4);
        lista.adicionar(a5);
        lista.adicionar(a6);
        lista.adicionar(a7);
        lista.adicionar(2, a1);

        cronometro.start();

        for(int i = 0; i < 1000; i++) {
            lista.adicionar(a1);
        }
        cronometro.finish();

        cronometro.tempoContato();

/*        System.out.println("Pega posição 5: " + lista.pega(5));


        lista.adicionar(5, a3);
        lista.remove(3);
        Aluno aluno4 = lista.pega(1);
*/

        System.out.println(lista.toString());
        System.out.println("Tamanho: " + lista.tamanho());
        lista.clear();

        lista.adicionar(a1);
        lista.adicionar(a2);
        lista.adicionar(a3);
        lista.adicionar(a4);
        lista.adicionar(a5);
        lista.adicionar(a6);
        lista.adicionar(a3);
        lista.adicionar(a7);
        lista.adicionar(a2);

        System.out.println("Contem? " + lista.contem(a1));
        System.out.println("Posicao? " + lista.indexOf(a1));
        System.out.println("Posicao? " + lista.indexOf(a2));
        System.out.println("Posicao? " + lista.lastIndexOf(a3));
  //      System.out.println("Aluno 4: " + aluno4.getNome());
    }
}
