package Semana_05.Aula_03;

import java.util.Scanner;

/**
 *
 * @author thomazpicelli
 */
public class Aula_03 {
    public static void main(String[] args) {
        Fila banco = new Fila(5);
        try{
            banco.enqueue(12);
            banco.enqueue(43);
            banco.enqueue(3);
            banco.enqueue(48);
            banco.enqueue(5);
            System.out.println("qtd: " + banco.size());
            System.out.println(" 1º " + banco.front());
            banco.dequeue();
            System.out.println(" 1º " + banco.front());
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(banco.size());
            System.out.println(banco.tempoMedio(num));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}