package Semana_05;

/**
 *
 * @author thomazpicelli
 */
public class Vetor {
    int[] A; 
    int size; 

    public Vetor(int capacity) {
        A = new int[capacity];
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return A.length == this.size;
    }

    public int size(){
        return this.size;
    }

    public int get(int i) throws Exception{
        if(isEmpty()) throw new Exception("Lista vazia");
        return A[i];
    }

    public void add(int i) throws Exception{
        if (isFull()) throw new Exception("Lista cheia");
        A[size] = i;
        size++;
    }

    public void remove(int i) throws Exception{
        if(isEmpty()) throw new Exception("Lista vazia");
        for (int j = i; j < size; j++){
            A[j] = A[j+1];
            size--;
        }
    }
}