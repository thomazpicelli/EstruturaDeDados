package Semana_05;

import java.util.Scanner;

/**
 * @see Utilizando pilhas para resolver expressões escritas no formato RPN(Reverse Polish Notation)
 * @author thomazpicelli
 */
public class Aula_01 {
    public static void main(String[] args) throws Exception {
        Stack pilha = new Stack(10);
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String[] quebra = texto.split(" ");
        for(int i = 0; i < quebra.length; i++) {
            if ( quebra[i].matches("[0-9]+")){
                pilha.push(Integer.parseInt(quebra[i]));
            }
            else{
                if(pilha.size() < 2){
                    System.out.println("São necessários 2 numeros para executar a operação!");
                    break;
                }
                int s1 = pilha.top();
                pilha.pop();
                int s2 = pilha.top();
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
        System.out.println("Resultado: " + pilha.top());
    }
}