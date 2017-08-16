package listas;


public class Nodo <T> {

    private T dato;
    private Nodo <T> sig;
    
     public Nodo(){
        dato=null;
        sig=null;
    }
    
    public Nodo(T d){
        dato=d;
        sig=null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }
    
    public String toString(){
        return dato.toString();
    }


    
}