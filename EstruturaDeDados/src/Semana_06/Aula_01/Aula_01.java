package Semana_06.Aula_01;

import java.util.Scanner;

/**
 *
 * @author thomazpicelli
 */
public class Aula_01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o tamanho da fila");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fila fila = new Fila(n);
        Stack pilha = new Stack(n);
        for (int i = 0; i < n; i++) {
            fila.enqueue((int)(100*Math.random()));
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fila.get(i) + ", ");
        }
        System.out.println("\nOs ultimos são o primeiros!");
        boolean troca = false;
        for (int i = 0; i < 2*n; i++) {
            if(troca == false){
                pilha.push(fila.front());
                fila.dequeue();
                if(fila.isEmpty()) troca = true;
            }
            else{
                fila.enqueue(pilha.top());
                pilha.pop();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fila.get(i) + ", ");
        }
    }
}