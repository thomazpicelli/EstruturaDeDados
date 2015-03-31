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
        int sorteio = (int)(10*Math.random());
        System.out.println("Matar de " + sorteio + " em " + sorteio);
        //processo de eliminação
        int cont = 0;
        int qntd = 10;
        while(qntd > 1){
            System.out.println("começa pela posicao " + começa);
            int posicao = começa;
            for (int i = 1; i <= sorteio; i++) {
                if(posicao == qntd-1)
                    posicao = 0;
                else
                    posicao++;
                System.out.println("p " + posicao);
                System.out.println("i " + i);
                if(i == sorteio){
                    System.out.println(fila[posicao] + " vai morrer na posicao " + posicao);
                    for (int j = posicao; j < qntd-1; j++) {
                        fila[j] = fila[j+1];
                        String a = fila[j+1];
                        System.out.println("posicao " + j + " recebeu "+ a);
                    }
                    cont++; qntd--;
                    System.out.println(cont + " soldados já foram mortos");
                    System.out.println("Restam " + qntd);
                    for (int k = 0; k < qntd; k++) {
                        System.out.print(fila[k] + ", ");
                    }
                    System.out.println("");
                    if(posicao == qntd)começa = 0;
                    else começa = posicao+1;
                }
            }
        }
        System.out.println("SOBREVIVEU " + fila[0]);
    }
}