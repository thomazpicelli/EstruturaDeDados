package Semana_11;

/**
 *
 * @author thomazpicelli
 */
public class LinkedList <E> {
    Node <E> header; // início da lista ligada
    Node <E> trailer; //final da lista ligada
    int size; // quantidade de elementos na lista ligada
    
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
    public Node first() throws Exception{
        if(isEmpty()) throw new Exception("Não existe primeiro");
        return this.header;
    }
    public Node last(){
        return trailer;
    }
    public void addFirst(E elemento){
        Node novo = new Node(elemento);
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
    public void addLast(E elemento){
        Node novo = new Node(elemento);
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
            System.out.print(aux.getElemento() + " ");
            aux = aux.getNext();
        }
        System.out.print(aux.getElemento() + " ");
        System.out.print("\nFIM DA LISTA!\n");
    }
    public void addAfter(E elementoNovo, E elemento) throws Exception{
        if(isEmpty()) throw new Exception("Lista vazioa não pode executar adicionar depois");
        Node novo = new Node(elementoNovo);
        if(elemento.equals(trailer.getElemento())){
            addLast(elementoNovo);
        }
        else{
            Node node;
            for (node = header; !node.getElemento().equals(elemento); node = node.getNext());
            novo.setPrev(node);
            novo.setNext(node.getNext());
            node.getNext().setPrev(novo);
            node.setNext(novo);
            size++;
        }
    }
    public void addBefore(E elementoNovo, E elemento) throws Exception{
        if(isEmpty()) throw new Exception("Lista vazia não pode executar adicionar antes");
        Node novo = new Node(elementoNovo);
        if(elemento.equals(header.getElemento())){
            addFirst(elementoNovo);
        } 
        else{
            Node node;
            for (node = header; !node.getNext().getElemento().equals(elemento); node = node.getNext());
            novo.setPrev(node.getPrev());
            node.getPrev().setNext(novo);
            node.setPrev(novo);
            novo.setNext(node);
            size++;
        }
    }
    public void remove(E remove)throws Exception{
        if(isEmpty()) throw new Exception("Lista vazia não pode executar a remição");
        if(header.getElemento().equals(remove)){
            header.getNext().setPrev(null);
            header = header.getNext();
        }
        if(trailer.getElemento().equals(remove)){
            trailer.getPrev().setNext(null);
            trailer = trailer.getPrev();
        }
        else{
            Node node;
            for (node = header; !(node.getElemento().equals(remove)); node = node.getNext());
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
        size--;
    }
}
