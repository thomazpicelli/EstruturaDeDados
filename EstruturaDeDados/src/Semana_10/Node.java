package Semana_10;

/**
 *
 * @author thomazpicelli
 */
public class Node {
    private String nomeAnimal; // elemento armazenado no nó
    private Node next; // próximo elemento da lista
    private Node prev; // elemento anteriror da lista

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    public Node(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.next = null;
    }
    public String getNomeAnimal(){
        return nomeAnimal;
    }
    public void setnomeAnimal(String nomeAnimal){
        this.nomeAnimal = nomeAnimal;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node no){
        this.next = no;
    }
}
