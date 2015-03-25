package Semana_06.Aula_03;

/**
 *
 * @author thomazpicelli
 */
public class Fila extends Vetor{
    int inicio;
    int fim;
    
    public Fila(int capacity){
        super(capacity);
        fim = 0;
        inicio = 0;
    }
    
    public int size(){
        // Devolve o número de elementos da fila
        return super.size();
    }
    
    public void enqueue(int E) throws Exception {
        // Enfileira, caso a fila não esteja cheia, o elemento E
        if(isFull())throw new Exception("Não há mais espaço na fila");
        if(fim == A.length)
            fim = 0;
        addPos(E, fim);
        fim++;
    }

    public void dequeue() throws Exception {
        // Desenfileira, caso a fila nãoo esteja vazia, o primeiro elemento
        if(isEmpty()) throw new Exception("Fila vazia!");
        if(inicio == A.length-1)
            inicio = 0;
        inicio++;
        size--;
    }

    public int front() throws Exception {
        // Devolve, sem desenfileirar, o primeiro elemento da fila
        if(isEmpty()) throw new Exception("Fila vazia!");
        return get(inicio);
    }
    
    public int tempoMedio(int qntAtend) throws Exception{
        if(isEmpty()) throw new Exception("Fila vazia!");
        return (size() * 5) / qntAtend;
    }

}