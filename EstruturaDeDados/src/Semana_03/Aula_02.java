package Semana_03;


public class Aula_02 {
    
    public static void main(String[] args) {
        int []v1 = new int[50000];
        preenchePior(v1);
        
        long inicio = System.currentTimeMillis();
        QuickSort2(0, v1.length-1, v1);
        long fim = System.currentTimeMillis();
        System.out.println ("Tempo meio: " + (fim - inicio));    
        
    }
    
    public static void preencheMedio(int[] vet){        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (50000*Math.random());
        }
    }
    
    public static void preenchePior(int[] vet){    
        for (int i = vet.length; i >0; i--) {
            vet[vet.length-i] = i;
        }
    }

    public static void bolha(int[] vet){
        int troca = 0;
        long cont = 0;
        for (int i = 0; i < vet.length-1; i++) {
            for (int j = i+1; j < vet.length; j++) {
                cont++;
                if(vet[i] > vet[j]){
                    troca = vet[i];
                    vet[i] = vet[j];
                    vet[j] = troca;
                }
            }
        }
    }
        
    public static void insert (int vet[]){
        int aux = 0, j;
        long cont =0;
        for (int i=1; i<vet.length ; i++){
            aux = vet[i];
            for (j=i-1; j>=0 && aux < vet[j]; j--){
                cont ++;
		vet[j+1] = vet[j];
            }
            vet[j+1] = aux;
	}
    }	
    
    public static int separa(int[] vetor, int ini, int fim) {
        int pivo,esq=0;
        pivo = vetor[ini];
        while (ini < fim){
            if (esq==0){
                if (pivo >= vetor[fim]){
                    vetor[ini]=vetor[fim];
                    ini++;
                    esq=1;
                }
                else
                    fim--;
            }
            else{
                if (pivo < vetor[ini]){
                    vetor[fim]=vetor[ini];
                    fim--;
                    esq=0;
                }
                else
                    ini++;
            }
        }
        vetor[fim]=pivo;
        return fim;
    }
    
    public static void mergeSort (int v[], int ini, int fim){
        if (ini<fim) {
            int meio = (ini+fim)/2;
            mergeSort (v, ini, meio);
            mergeSort (v, meio+1, fim);
            intercalacao (v, ini, meio, fim);
        }
    }
    public static void intercalacao (int v[], int ini, int meio, int fim){
        int[] w = new int [fim-ini+1];
        int i = ini; int j = meio+1; int k = 0;
        while (i<=meio && j<=fim) {
            if (v[i]<=v[j]) {
                w[k] = v[i]; k++; i++; 
            }
            else {
                w[k] = v[j]; k++; j++;
            }
        }
        while (i<=meio) { //Copia restante da primeira metade
            w[k] = v[i]; k++; i++; 
        }
        while (j<=fim) { //Copia restante da segunda metade
            w[k] = v[j]; k++; j++; 
        }
        // Copia os elementos levados para w de volta para o vetor v
        for (i=0;i<=fim-ini;i++) 
            v[ini+i] = w[i];
    }
    
    public static void quickSort (int[] vetor, int ini, int fim){
        int k;
        if (fim > ini) {
            k=separa(vetor, ini,fim);
            quickSort(vetor, ini, k-1);
            quickSort(vetor, k+1, fim);
        }
    }

    // A funcao QuickSort recebe como parametro, p < r, 
    // e rearranja o vetor de modo que ele fique em ordem crescente. 
    public static void QuickSort2( int p, int r, int v[]){
        if (p < r) {
            int q = particao(p, r, v );
            QuickSort2( p, q - 1, v);
            QuickSort2( q + 1, r, v);
        }
    }

    // Supondo i < f, a funcao rearranja o vetor v[p]..v[r] de tal que de modo que: 
    // v[p]..v[j-1]<=v[j]<v[j+1]..v[r], para algum j em p..r, onde em v[j] estaria o pivo
    public static int particao( int p, int r, int v[]){
        int c, i, j;
        c = v[p];
        i = p+1;
        j = r;
        while (i <= j ) {
            if (v[i] <= c) 
                i++; // sobe i, procurando o primeiro maior ou igual elemento em relacao ao pivo
            else 
                if ( v[j] > c ) 
                    j--; // desce j, procurando o primeiro menor elemento em relacao ao pivo
                else{
                    // troca
                    int t = v[i]; v[i] = v[j]; v[j] = t; 
                    i++; j--;
                }
        }
        // agora i == j+1
        v[p] = v[j]; v[j]=c;
        return j;
    }
        
    public static void exibe(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" " + vet[i]);           
            
        }
        System.out.println("");
    }
}
