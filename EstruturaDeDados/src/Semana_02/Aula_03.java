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
        int ex1 = ex1(8,9);
        int ex2 = ex2(3);
        int ex3 = ex3a(2);
        int ex4 = strange(3);
        int ex5 = ex5a(3);
        int ex6 = ex6(4);
        int ex7 = ex7a(8);
        ex8(5);
        int ex9 = ex9(6,4);
        int ex10 = ex10(4);
        for (int k = 1; k < 10; k++) {
            if (k != 8){
                System.out.println("ex"+k);
            }
        }
    }
    
    //ex aula
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
    
    //ex1
    static int ex1(int x, int y) {
        if(x == 0)
            return y;
        else
            return ex1(x - 1, y + 1);
    }
    
    //ex2
    static int ex2(int num) {
        if( num <= 1 )
            return 1;
        else
            return 3*ex2( num-1 ) + ex2( num-2 );
    }
    
    //ex3
    static int ex3a(int num) {
        if ( num <= 2 )
            return num;
        else
            return num*ex3b(num-1);
    }
    static int ex3b( int num) {
        if ( num <= 2 )
            return num;
        else
            return (num-1)*ex3a(num+1);
    }
    
    //ex4
    static int strange(int x){
        if ((x % 2) != 0)
            return x;
        return 2 * strange(x/2);
    }
    
    //5
    static int ex5a(int x){ 
        if (x > 0) 
            return ex5b(x) + ex5a(x-1);
        return 1; 
    }
    static int ex5b(int x){
        if (x > 0) 
            return ex5b(x-1) + ex5a(x-1) - 1;
         return 1;
    }
    
    //ex6
    static int ex6(int na){ 
        if (na <= 0) 
            return 1;
        else 
            return 3 + ex6(na-1) + ex6(na-2);
    }
    
    //ex7
    static int ex7a(int n){ 
        return ex7b(n,0,1);
    }
    static int ex7b(int n, int a, int b) {
        if(n==0) 
            return a;   
        else 
            return ex7b(n-1,b,a+b);
    }
    
    //ex8
    static void ex8(int n){
        if(n>0){
            System.out.println(n);
            ex8(n-1);
        }
        else{
            System.out.println("Fogo!");
        }
    }
    
    //ex9
    public static int ex9(int a, int b){
        if(a>b){
            if(a-(b+1) >= 0){
                return a + ex9(a-1,b);
            }
            return a;
        }
        else{
            if(b-(a+1) >= 0){
                return b + ex9(a,b-1);
            }
            return b;
        }
    }
    
    //ex10
    static int ex10(int n){ 
        if (n == 1 || n == 2)
            return n;
        else 
            return ex10(n-1) + n * ex10(n-2);
    }

    //ex11
    public static int x(int a, int b){
        return 0;
    }
}