package Semana_01;

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
    
    public static boolean lastDigit(int num1, int num2){
        int mod1 = 0;
        int mod2 = 0;
        
        while(num1<9){
            mod1 = num1 % 10;
        }
        while(num2<9){
            mod2 = num2 % 10;
        }
        if (mod1 == mod2){ 
            return true;
        }
        else{
            return false;
        }
    } 
            
    public static void main(String args[]){
        Aleatorio();
        boolean result = lastDigit(22,32);
        System.out.println(result);
    }
}