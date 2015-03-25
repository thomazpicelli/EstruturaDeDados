package Semana_06.Aula_03;

public class Vetor2Prof {
	
	int[] vetor;   	// armazena os elementos do vetor
	int size;		// capacidade do vetor
	
	public Vetor2Prof(int capacity) {
        // cria um vetor com certa capacidade
		this.vetor = new int[capacity];
		this.size = 0;
	}
	
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if (size+1 == vetor.length)
			return true;
		else
			return false;
	}
	
	public int size() {
		return size;
	}
	
	public int get(int i) throws Exception {
		if (i>=size)
			throw new Exception ("Posi��o inv�lida!");
		return (vetor[i]);		
	}
			
	public void addPos(int n, int i) throws Exception {
		//insere o elemento n na posi��o i
		if (isFull())
			throw new Exception ("Lista Cheia!");
		if (i>size)
			throw new Exception ("Posi��o inv�lida!");
		for (int j=size-1;j>=i;j--)
				vetor[j+1]=vetor[j];
		vetor[i]=n;
		size++;		
	}
	
	public void add(int n) throws Exception {
		//insere o elemento n no final da lista
		if (isFull())
			throw new Exception ("Lista Cheia!");
		vetor[size]=n;
		size++;
	}
	
	public void remove(int i) throws Exception {
		if (isEmpty())
			throw new Exception ("Lista Cheia!");
		if (i>=size)
			throw new Exception ("Posi��o inv�lida!");		
		for(int j=i;j<=size-2;j++)
            vetor[j]=vetor[j+1];
        size--;
	}

}
