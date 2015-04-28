package Semana_11.Aula_02;

/**
 * @author thomazpicelli
 */
public class Fila <E> extends LinkedList{
    public Fila() {
        super();
    }
    public int size(){
        return super.size();
    }
    public void enqueue(E equeue){
        addLast(equeue);
    }
    public void dequeue() throws Exception {
        remove(first().getElemento());
    }
    public Node front() throws Exception {
        return first();
    }
}