package model;

public class Celula {
    private Celula proxima;
    private Object object;

    public Celula(Object object) { this.object = object; }

    public Celula(Celula proxima, Object object) {
        this.proxima = proxima;
        this.object = object;
    }

    public void setProxima(Celula object) {
        this.proxima = object;
    }

    public Celula getProxima(){ return proxima; }

    public void setObject(Object object) { this.object = object;}

    public Object getObject() {
        return object;
    }
}
