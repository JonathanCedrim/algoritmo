package model;

public class Pilha<T> {

    int total = 0;
    Object[] pilha = new Object[100];

    public void adiciona(T object) {
        //dobraTamanho();
        if(total + 1 >= pilha.length) {
            new Exception("Stack OverFlow").printStackTrace();
            System.exit(0);
        }
        pilha[total] = object;
        total++;
    }

    public void remove() {
        if(total == 0) {
            new Exception("Empty Stack").printStackTrace();
            System.exit(0);
        }
        pilha[total] = null;
        total--;
    }

    public int total() {
        return this.total;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(pilha[0]);

        for(int it = 1; it < total; it++) {
            sb.append(", " + pilha[it].toString());
        }
        return sb.toString();
    }

    private void dobraTamanho() {
        if(total == pilha.length){
            Object[] pilhaAux = pilha;
            pilha = new Object[pilha.length * 2];

            for(int it = 0; it < total; it++) {
                pilha[it] = pilhaAux[it];
            }
        }
    }
}