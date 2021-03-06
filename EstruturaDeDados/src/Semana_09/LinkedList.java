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
        Node node;
        for (node = header; !node.getNomeAnimal().equals(animal); node = node.getNext());
        novo.setNext(node.getNext());
        node.setNext(novo);
        size++;
    }
    public void addBefore(String animalNovo, String animal) throws Exception{
        if(isEmpty()) throw new Exception("Lista vazia não pode executar adicionar antes");
        Node novo = new Node(animalNovo);
        if(animal.equals(header.getNomeAnimal())){
            novo.setNext(header);
            header = novo;
        } 
        else{
            Node node;
            for (node = header; !node.getNext().getNomeAnimal().equals(animal); node = node.getNext());
            novo.setNext(node.getNext());
            node.setNext(novo);
        }
        size++;
    }
    public void remove(String remove)throws Exception{
        if(isEmpty()) throw new Exception("Lista vazia não pode executar a remição");
        if(header.getNomeAnimal().equals(remove)) header = header.getNext();
        else{
            Node anterior = null;
            Node no;
            for (no = header; !no.getNomeAnimal().equals(remove); no = no.getNext()){
                anterior = no;
            }
            anterior.setNext(no.getNext());
        }
        size--;
    }
}
