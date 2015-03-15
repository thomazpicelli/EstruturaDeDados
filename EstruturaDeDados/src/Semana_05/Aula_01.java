package Semana_05;

import java.util.Scanner;
import java.util.Stack;

/**
 * @see Utilizando pilhas para resolver expressões escritas no formato RPN(Reverse Polish Notation)
 * @author thomazpicelli
 */
public class Aula_01 {
    public static void main(String[] args) {
        Stack pilha = new Stack();
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String[] quebra = texto.split(" ");
        for(int i = 0; i < quebra.length; i++) {
            if ( quebra[i].matches("[0-9]+")){
                pilha.push(Integer.parseInt(quebra[i]));
            }
            else{
                int s1 = (int)pilha.lastElement();
                pilha.pop();
                int s2 = (int)pilha.lastElement();
                pilha.pop();
                int result = 0;
                switch (quebra[i]){
                    case "+":
                        result = s1 + s2; break;
                    case "-":
                        result = s1 - s2; break;
                    case "*":
                        result = s1 * s2; break;
                    case "/":
                        result = s1 / s2; break;
                    default:
                        System.out.println("Operador inválido!"); break;
                }
                pilha.push(result);
            }
        }
        System.out.println("Resultado: " + pilha.lastElement());
    }
}