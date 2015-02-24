package Semana_02;

public class Aula_01 {
    
    public static void main(String args[]){
        int[] vetor = new int[5000];
        
        preencheVetor(vetor);
        
        //long cont = bolha(vetor);
        //long cont = insert(vetor);
        long cont = select(vetor);
        System.out.println("Total de comparações: " + cont);
        exibe(vetor);
    }
    
    public static void preencheVetor(int[] vet){        
        //CASO MEDIO
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (5000*Math.random());
        }
        /*
        //PIOR CASO
        for (int i = vet.length; i >0; i--) {
            vet[vet.length-i] = i;
        }
        
        //MELHOR CASO
        for (int i = 0; i < vet.length; i++) {
            int w = vet[i];  
        }
        */
    }
    
    public static long select(int vet[]){
	long cont = 0;
        int min, aux;
        for (int i=0 ; i<vet.length-1 ; i++){
            min = i;
            for (int j=i+1; j<vet.length; j++){
                cont ++;
                if(vet[j] < vet[min]){
                    min = j;
                }
            }
            if (i != min){
                aux = vet[i];
                vet[i] = vet[min];
                vet[min] = aux;
            } 
	}
        return cont;
    }
    
    public static long insert (int vet[]){
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
        return cont;
    }	
    
    public static long bolha(int[] vet){
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
        return cont;
    }
    
    public static void exibe(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" " + vet[i]);           
        }
    }
    
}
