package Semana_06.Aula_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thomazpicelli
 */
public class Aula_02 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        System.out.println("Digite o nome dos 10 jogadores");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            String nome = sc.nextLine();
            fila.add(nome);
        }
        int rodada = 1;
        while(fila.size() != 1){  
            if(fila.isEmpty()){
                System.out.println("Não houve vencedor!");
                break;
            }
            System.out.println(rodada + "ª rodada! " + fila.size() + " jogadores continuam no jogo");
            int cont = fila.size();
            for (int i = 0; i < cont; i++) {
                System.out.println(fila.element() + " prepare-se para chutar a bola!");
                Random chute = new Random();
                boolean resultado = chute.nextBoolean();
                if(resultado){
                    System.out.println("GOL!!!");
                    System.out.println(fila.element() + ", você continua no jogo \nVá para o final da fila!");
                    fila.add(fila.poll());
                }
                else
                    System.out.println(fila.poll() + ", você está eliminado do jogo");
                System.out.println("\n");    
            }
            rodada++;
        }
        if(fila.isEmpty() == false) System.out.println(fila.element() + " é o vencedor!!!!!!");
    }
}
