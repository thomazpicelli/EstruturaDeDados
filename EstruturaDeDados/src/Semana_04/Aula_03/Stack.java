package Semana_04.Aula_03;

/**
 *
 * @author thomazpicelli
 */
public class Stack extends Vetor{
    int top; 
    
    public Stack(int capacity){
        // Cria uma pilha com uma capacidade inicial
        super(capacity);
        top=-1;
    }
    
    public int size(){
        //não existe pre-condicao, se vazia, retorna 0, sem problema
        //size da classe vetor (nao recursivo)
        return super.size;
    }

    public void push(int n) throws Exception {
        if(isFull())throw new Exception("Não há mais espaço");
        add(n);
        top++;
    }

    public void pop() throws Exception {
        if(isEmpty()) throw new Exception("Lista vazia");
        remove(top+1);
        top--;
    }

    public int top() throws Exception {
        if(isEmpty()) throw new Exception("Lista vazia");
        return get(top);
    }
}
