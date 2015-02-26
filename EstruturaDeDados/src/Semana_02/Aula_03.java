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
        //int f = f(8,9);
        //int g = g(3);
        //System.out.println(f + " " + g);
        //int f = f(6);
        //int s = strange(3);
        //System.out.println(s);
        int a = a(6,2);
        System.out.println(a);
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
    /*
    static int f(int x, int y) {
        if(x == 0)
            return y;
        else
            return f(x - 1, y + 1);
    }
    static int g(int num) {
        if( num <= 1 )
            return 1;
        else
            return 3*g( num-1 ) + g( num-2 );
    }
    */
    static int f( int num ) {
        if ( num <= 2 )
            return num;
        else
            return num*g(num-1);
    }
    static int g( int num ) {
        if ( num <= 2 )
            return num;
        else
            return (num-1)*f(num+1);
    }
    
    static int strange(int x){
        if ((x % 2) != 0)
            return x;
        return 2 * strange(x/2);
    }
    //teste
    public static int a(int a, int b){
        int tot = 0;
        if (a > b){
            for (int i = a; i > b; i--) {
                tot += i;
                System.out.println(tot);
                return a(i-1,b); 
            }
        }
        else{
            for (int j = b; j <= a; j--){
                tot += j; 
                return a(a,j-1);
            }
        }
        return tot;
    }
}