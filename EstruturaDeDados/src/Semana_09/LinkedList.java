package Semana_09;

/**
 *
 * @author thomazpicelli
 */
public class LinkedList {
    private Node header; // início da lista ligada
    private int size; // quantidade de elementos na lista ligada
    private Object n;
    
    public LinkedList(){
        // inicializa a lista como vazia
        header = null ;
        size=0;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public Node first(){
        // retorna o Nó inicial da lista
        return this.header;
    }
    public Node last(){
        if(isEmpty() == true) return null;
        Node node;
        for (node = header; node.getNext() != null; node = node.getNext());
        return node;
    }
    public void addFirst(String nomeAnimal){
        Node novo = new Node(nomeAnimal);
        novo.setNext(header);
        header = novo;
        size++;
    }
    public void addLast(String nomeAnimal){
        Node novo = new Node(nomeAnimal);
        if(header == null){
            novo.setNext(header);
            header = novo;
        }
        else{
            Node no = last();
            no.setNext(novo);
        }
        size++;
    }
    public void addAfter(String animal, String novoInserir){
        Node novo = new Node(novoInserir);
        if(header == null){
            novo.setNext(header);
            header = novo;
        } 
        else{
            Node n;
            for (n = header; n.getNomeAnimal() == animal; n = n.getNext());
            novo.setNext(n.getNext());
            n.setNext(novo);
        }
        size++;
    }
}
