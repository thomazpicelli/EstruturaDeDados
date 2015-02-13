package Semana_01;

public class Aula_02 {
    public static int ex3(int n){
        int s = 0;
        int i = n;
        while(i>0){
            for(int j = 1; j <= n; j++){
                s++;
            }
            i--; 
        }
        return s;
    }
    
    public static int ex4(int n){
        int S1 = 0;
        for(int i = 1; i <= n/2; i++){
            for(int j = 1; j <= n*n; j++){
                S1++;
            }
        }
        return S1;
    }
    
    public static void main(String args[]){
        int a = ex3(8);
        System.out.println(a);
        int b = ex4(8);
        System.out.println(b);
        
    }
}
