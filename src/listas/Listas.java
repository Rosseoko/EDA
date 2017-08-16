/*
1) Programas milista, nodo
2) Método para insertar
3)Método para imprimir
4) "" al revés
      usando una pila (Clase stack de java)
      Recursivamente 
 */
package listas;

/**
 *
 * @author computacion1
 */
public class Listas <T> {

    /**
     * @param args the command line arguments
     */
    
    private Nodo<T> cabeza;
    private int cont;
    
    Listas(){
     cabeza=new Nodo<T>();
     cont=0;
    
    }
    
    public void inserta(T dato) {
        Nodo<T> nuevoNodo = new Nodo<T>(dato);
        nuevoNodo.setSig(cabeza);
        cabeza = nuevoNodo;

    }
    
       public String imprimeLista() {
        StringBuilder sc = new StringBuilder("");
        Nodo<T> aux = cabeza;
        while (aux != null) {
            sc.append(aux.toString() + " ");
            aux = aux.getSig();
        }
        return sc.toString();
    }

       
       public String imprimeListaR() {
        StringBuilder sc = new StringBuilder("");
        Nodo<T> aux = cabeza;
        
        if (aux != null) {
            imprimeListaR();
            sc.append(aux.toString() + " ");
            aux = aux.getSig();
        }
        return sc.toString();
    }
    
      public boolean isEmpty() {
        boolean resp = false;
        if (cabeza == null) {
            resp = true;
        }
        return resp;
    }
     
     
       public void imprimeAlreves() {
        Nodo<T> aux = cabeza;
        if (!isEmpty()) {
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            System.out.println(aux.getDato());
        } 
    }

    
    public static void main(String[] args) {
        Listas<Integer> l= new Listas();
        
        l.inserta(1);
        l.inserta(2);
        l.inserta(3);
        
        l.imprimeLista();
        
        
    }
    
}
