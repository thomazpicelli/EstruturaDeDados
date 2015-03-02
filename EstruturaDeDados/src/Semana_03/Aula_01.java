package Semana_03;

public class Aula_01 {
    static long cont = 0;
    
    public static void main(String args[]){
        int[] vetor = new int[500];
        cont = 0;
        preencheMelhor(vetor);
        //preencheMedio(vetor);
        //preenchePior(vetor);
        exibe(vetor);
        quickSort(vetor, 0, vetor.length-1);
        System.out.println(" ");
        System.out.println("Total de comparações: " + cont);
        exibe(vetor);
    }
    
    public static void preencheMedio(int[] vet){        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (5000*Math.random());
        }
    }
    
    public static void preenchePior(int[] vet){    
        for (int i = vet.length; i >0; i--) {
            vet[vet.length-i] = i;
        }
    }
    
    public static void preencheMelhor(int[] vet){    
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;  
        }
    }
    
    public static int separa(int[] vetor, int ini, int fim) {
        int pivo,esq=0;
        pivo = vetor[ini];
        while (ini < fim){
            if (esq==0){
                cont++;
                if (pivo >= vetor[fim]){
                    vetor[ini]=vetor[fim];
                    ini++;
                    esq=1;
                }
                else
                    fim--;
            }
            else{
                cont++;
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
    
    public static void quickSort (int[] vetor, int ini, int fim){
        int k;
        if (fim > ini) {
            k=separa(vetor, ini,fim);
            quickSort(vetor, ini, k-1);
            quickSort(vetor, k+1, fim);
        }
    }

    public static void exibe(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" " + vet[i]);           
        }
    }
}