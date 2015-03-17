package Semana_05.Aula_02;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author thomazpicelli
 */
public class conversao {
    public static void main(String[] args) {
        int num = 0, resto=0;
        Stack<Integer> pilha = new Stack<Integer>();
        do{
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        }while(num <= 0);    
        while(num % 16 != 0){
            resto = num % 16;
            pilha.push(resto);
            num = num / 16;
        }
        do{
            switch(pilha.peek()){
                case 10:
                    System.out.print(" A ");
                    break;
                case 11:
                    System.out.print(" B ");
                    break;
                case 12:
                    System.out.print(" C ");
                    break;
                case 13:
                    System.out.print(" D ");
                    break;
                case 14:
                    System.out.print(" E ");
                    break;
                default:
                    System.out.print(" " + pilha.peek() + " ");
            }
            pilha.pop();
        }while (pilha.empty() == false);
    }
}
