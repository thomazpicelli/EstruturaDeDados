package Semana_02;

/**
 * @see Revisão de Recursividade;
 * @author thomazpicelli
 */
public class Aula_03 {
    public static void main(String args[]){
        int i = digitos(150000);
        int j = digitosR(150000);
        System.out.println(i + " " + j);
    }
    
    public static int somanum(int n){
        if(n == 1){
            return 1; 
        }
        else{
            return n + somanum(n-1);
        }
    }
    
    public static int digitos(int n){
        int cont = 1;
        while(Math.abs(n)>9){
            n = n / 10;
            cont ++;
        }
        return cont;
    }
    
    public static int digitosR(int n){
        if(Math.abs(n)<9){
            return 1; 
        }
        else{
            return 1 + digitosR(n/10);
        }
    }
}