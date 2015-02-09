package Aula_01;

import java.util.Random;

/**
 *
 * @author 31452760
 */
public class Aula_01{
    
    public static void Aleatorio(){
        int vet1[] = new int[50];
        int vet2[] = new int[50];
        int k = 0;
        
        for(int i = 0; i < vet1.length; i++){
            vet1[i] = (int)(Math.random() * 200); 
            //System.out.print(vet1[i]);
            if(vet1[i]%2 != 0){
                vet2[k] = vet1[i];
                k++;
            } 
        }
        for(int j = 0; j < k; j++){
            System.out.print(vet2[j] + ", ");
        }
    }
    
    public static boolean lastDigit(int x, int y){
        String temp1 = Integer.toString(x);
        String temp2 = Integer.toString(y);
        
        int guess1[] = new int[temp1.length()];
        int last1 = guess1[temp1.length() - 1];
        int guess2[] = new int[temp2.length()];
        int last2 = guess2[temp2.length() - 1];
        if (last1 == last2){
            return true;
        } 
        else{
            return false;
        }
    } 
            
    public static void main(String args[]){
        //Aleatorio();
        boolean oi = lastDigit(22,372);
        System.out.println(oi);
    }
}