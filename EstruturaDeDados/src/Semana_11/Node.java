package Semana_11;

/**
 *
 * @author thomazpicelli
 * @param <E>
 */
public class Node <E> {
    E elemento; // elemento armazenado no nó
    private Node next; // próximo elemento da lista
    private Node prev; // elemento anteriror da lista

    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public Node(E elemento) {
        this.elemento = elemento;
        this.next = null;
        this.prev = null;
    }
    public E getElemento() {
        return elemento;
    }
    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node no){
        this.next = no;
    }
}
