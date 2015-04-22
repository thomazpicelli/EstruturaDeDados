package Semana_10;

/**
 *
 * @author thomazpicelli
 */
public class LinkedList {
    private Node header; // início da lista ligada
    private Node trailer; //final da lista ligada
    private int size; // quantidade de elementos na lista ligada
    
    public LinkedList(){
        // inicializa a lista como vazia
        header = null;
        trailer = null;
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
        return trailer;
    }
    public void addFirst(String nomeAnimal){
        Node novo = new Node(nomeAnimal);
        if(isEmpty()){
            header = novo;
            trailer = novo;
        }
        else{
            header.setPrev(novo);
            novo.setNext(header);
            header = novo;
        }
        size++;
    }
    public void addLast(String nomeAnimal){
        Node novo = new Node(nomeAnimal);
        if(isEmpty()){
            header = novo;
            trailer = novo;
        }
        else{
            trailer.setNext(novo);
            novo.setPrev(trailer);
            trailer = novo;
        }
        size++;
    }
    public void mostraLista(){
        Node aux = header;
        while (aux.getNext()!=null){
            System.out.print(aux.getNomeAnimal()+ " ");
            aux = aux.getNext();
        }
        System.out.print(aux.getNomeAnimal()+ " ");
        System.out.print("\nFIM DA LISTA!\n");
    }
    public void addAfter(String animalNovo, String animal) throws Exception{
        if(isEmpty()) throw new Exception("Lista vazioa não pode executar adicionar depois");
        Node novo = new Node(animalNovo);
        if(animal.equals(trailer.getNomeAnimal())){
            addLast(animalNovo);
        }
        else{
            Node node;
            for (node = header; !node.getNomeAnimal().equals(animal); node = node.getNext());
            novo.setPrev(node);
            novo.setNext(node.getNext());
            node.getNext().setPrev(novo);
            node.setNext(novo);
            size++;
        }
    }
    public void addBefore(String animalNovo, String animal) throws Exception{
        if(isEmpty()) throw new Exception("Lista vazia não pode executar adicionar antes");
        Node novo = new Node(animalNovo);
        if(animal.equals(header.getNomeAnimal())){
            addFirst(animalNovo);
        } 
        else{
            Node node;
            for (node = header; !node.getNext().getNomeAnimal().equals(animal); node = node.getNext());
            novo.setPrev(node.getPrev());
            node.getPrev().setNext(novo);
            node.setPrev(novo);
            novo.setNext(node);
            size++;
        }
    }
    public void remove(String remove)throws Exception{
        if(isEmpty()) throw new Exception("Lista vazia não pode executar a remição");
        if(header.getNomeAnimal().equals(remove)){
            header.getNext().setPrev(null);
            header = header.getNext();
        }
        if(trailer.getNomeAnimal().equals(remove)){
            trailer.getPrev().setNext(null);
            trailer = trailer.getPrev();
        }
        else{
            Node node;
            for (node = header; !(node.getNomeAnimal().equals(remove)); node = node.getNext());
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
        size--;
    }
}
