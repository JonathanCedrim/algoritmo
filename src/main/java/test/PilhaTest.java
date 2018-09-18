package Teste;

import model.Aluno;
import model.Pilha;

public class PilhaTest {
    public static void main(String [] args) {
        Pilha<Aluno> pilha = new Pilha<Aluno>();


        pilha.adiciona(new Aluno("Adriano"));
        pilha.adiciona(new Aluno("Maycom"));
        pilha.adiciona(new Aluno("Lucas"));
        pilha.adiciona(new Aluno("Kaique"));
        pilha.adiciona(new Aluno("Jonathan"));

        System.out.println(pilha.toString());

        for(int it = 0; it < 100; it ++) {
            pilha.adiciona(new Aluno("Jonathan"));
        }

        pilha.remove();

        System.out.println(pilha.toString());

        System.out.println(pilha.total());
    }
}
