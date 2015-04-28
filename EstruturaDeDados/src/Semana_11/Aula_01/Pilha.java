package Semana_11.Aula_01;

/**
 * @author thomazpicelli
 */
public class Pilha <E> extends LinkedList{
    public Pilha() {
        super();
    }
    public void pop() throws Exception{
        remove(first());
    }
    public void push(E elemento){
        addFirst(elemento);
    }
    public Node <E> top() throws Exception{
        if(isEmpty()) throw new Exception("Não existe top");
        return first();
    }
}