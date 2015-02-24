package Semana_02;

import java.util.Scanner;

public class Aula_02 {
    
    public static void main(String args[]){
        int[] vetor = new int[500];
        
        preencheVetor(vetor);
        
        insert(vetor);
        exibe(vetor);
        //Scanner sc = new Scanner(System.in); 
        //int x = sc.nextInt();
        int x = 5001;
        //long cont1 = buscaLinear(vetor, x);
        //System.out.println(cont1);
        long cont2 = buscaBinaria(vetor, x);
        System.out.println(cont2);
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
    
    public static int buscaLinear(int []vet, int x){
        int cont=0;
        for (int i=0; i<vet.length; i++){
            cont++;
            if (vet[i] == x){
                break;
            }
        }
        return cont;    
    }
    
    public static int buscaBinaria(int vet[], int x){
        int cont = 0, ini = 0, fim = vet.length-1;
        int meio = (ini + fim)/2;
        while (ini <= fim) {
            cont++;
            if (x == vet[meio]){
                return cont;
            }
            else{
                if (x < vet[meio]){ 
                    fim = meio -1;
                }
                else {
                    ini = meio + 1;
                }
            }
        }
        return cont;
    }  
    
    public static void insert (int vet[]){
        int aux = 0, j;
        for (int i=1; i<vet.length ; i++){
            aux = vet[i];
            for (j=i-1; j>=0 && aux < vet[j]; j--){
        	vet[j+1] = vet[j];
            }
            vet[j+1] = aux;
	}
    }	
    
    public static void exibe(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.print(" " + vet[i]);           
        }
    }
    
}
