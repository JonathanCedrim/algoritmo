package model;

public class Cronometro {
    double tempoInicial = 0;
    double tempoFinal = 0;
    double contado = 0;

    public void start() {
        this.tempoInicial = System.currentTimeMillis();
    }

    public void finish() {
        this.tempoFinal = System.currentTimeMillis();
    }

    public void tempoContato() {
        this.contado = (tempoFinal - tempoInicial) / 1000.0;
        System.out.println("tempo final: " + this.contado);
    }
}
