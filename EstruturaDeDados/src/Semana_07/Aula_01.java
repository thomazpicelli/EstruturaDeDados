package Semana_07;

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
        int sorteio = 0;
        while(sorteio==0) sorteio = (int)(10*Math.random());
        System.out.println("Os soldados serão mortos de " + sorteio + " em " + sorteio);
        //processo de eliminação
        int cont = 0;
        int qntd = 10;
        int posicao = começa;
        while(qntd > 1){
            System.out.println("começa a contagem pela posicao " + posicao);
            for (int i = 1; i <= sorteio; i++) {
                if(posicao >= qntd-1)
                    posicao = 0;
                else
                    posicao++;
                System.out.println("p " + posicao);
                System.out.println("i " + i);
                System.out.println("----------");
                if(i == sorteio){
                    System.out.println(fila[posicao] + " vai morrer na posicao " + posicao);
                    for (int j = posicao; j < qntd-1; j++) {
                        fila[j] = fila[j+1];
                        System.out.println("posicao " + j + " recebeu "+ fila[j+1]);
                    }
                    cont++; qntd--;
                    System.out.println(cont + " soldados já foram mortos");
                    System.out.println("Restam " + qntd);
                    for (int k = 0; k < qntd; k++) {
                        System.out.print(fila[k] + ", ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("SOBREVIVEU " + fila[0]);
    }
}