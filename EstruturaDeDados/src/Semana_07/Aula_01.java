package Semana_07;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thomazpicelli
 */
public class Aula_01 {
    public static void main(String[] args) {
        String[] fila = new String[10];
        System.out.println("Digite o nome dos 10 soldados");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            String nome = sc.nextLine();
            fila[i] = nome;
        }
        boolean existe = false;
        int começa = -1;
        while(existe == false){        
            System.out.println("Digite o nome do soldado escolhido");
            String escolhido = sc.nextLine();
            for (int i = 0; i < fila.length; i++) {
                if(fila[i].equals(escolhido)){
                    System.out.println("A contagem começa com o soldado " + escolhido);
                    existe = true;
                    começa = i;
                }
            }
            if(!existe)System.out.println("NÃO EXISTE SOLDADO COM ESTE NOME!!!");
        }
        int sorteio = (int)(10*Math.random());
        sorteio = 3;
        System.out.println(sorteio);
        //processo de eliminação
        int cont = 0;
        int qntd = 10;
        while(10-cont > 2){
            int posicao = começa;
            for (int i = 1; i <= sorteio; i++) {
                if(posicao == 10 - cont)
                    posicao = 0;
                else
                    posicao++;
                System.out.println("p " + posicao);
                System.out.println("i " + i);
                if(i == sorteio){
                    System.out.println(fila[posicao] + " vai morrer na posicao" + posicao);
                    for (int j = posicao; j <= qntd-cont; j++) {
                        fila[j] = fila[j+1];
                        System.out.println("JOTAAA " + j + "recebeu "+ j+1);
                    }
                    começa = posicao+1;
                    System.out.println("começa" + começa);
                    System.out.println("CONT "+ cont);
                }
            }
            cont++;
            qntd--;
            for (int i = 0; i < fila.length; i++) {
                System.out.print(fila[i] + ", ");
                
            }
            System.out.println("");
        }
    }
}