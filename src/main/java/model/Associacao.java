package model;

public class Associacao {
    private String chave;
    private Object object;
	
    public Associacao(String chave, Object object) {
        this.chave = chave;
        this.object = object;
    }

    public String getChave() {
        return chave;
    }

    public void setPlaca(String chave) {
        this.chave = chave;
    }

    public Object getObject() {
	    return this.object;
    }

    @Override
    public String toString() {
        return this.object.toString();
    }
}
