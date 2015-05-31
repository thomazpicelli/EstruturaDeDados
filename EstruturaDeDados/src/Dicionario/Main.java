package Dicionario;

import java.util.Scanner;

/**
 *
 * @author thomazpicelli e marcelooliveira
 */
public class Main {
    private static Dicionario dicionario;
    
    public static void main(String[] args) {
        dicionario = new Dicionario(50);
        MenuPrincipal();
    }
    
    public static void MenuPrincipal(){
        System.out.println("Menu Principal - Digionario Inglês-Português");
        System.out.println("============================================");
        System.out.println("1- Incluir Definição:");
        System.out.println("2- Excluir Definição:");
        System.out.println("3- Consultar Definição:");
        System.out.println("4- Consultar Definição que inicial com:");
        System.out.println("5- Ver quantidade de Definições cadastradas:");
        System.out.println("6- Encerrar");
        System.out.println("============================================");
        System.out.println("Digite o numero do função que deseja executar:");
        int n = -1;
        do{
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n<1 || n>6);
        switch(n){
            case 1:
                Inserir();                
                break;
            case 2:
                Excluir();
                break;
            case 3:
                Consultar();
                break;
            case 4:
                ConsultaIni();
                break;
            case 5:
                Quantidade();
                break;
            case 6:
                System.out.println("Volte Sempre!!!");
                break;
        }
    }	
    
    public static void Inserir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra de deseja incluir:");
        String palavra = sc.nextLine();
        System.out.println("Digite a tradução desta palavra:");
        String traducao = sc.nextLine();
        dicionario.Put(new Definicao(palavra, traducao));
        MenuPrincipal();
    }
    public static void Excluir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra de deseja excluir:");
        String palavra = sc.nextLine();
        dicionario.Remove(palavra);
        MenuPrincipal();
    }
    public static void Consultar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra de deseja Consultar:");
        String palavra = sc.nextLine();
        System.out.println("A tradução é:\n" + dicionario.ConsultaTrad(palavra) + "\n");
        MenuPrincipal();
    }
    public static void ConsultaIni(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o inicio da palavra de deseja Consultar:");
        String palavra = sc.nextLine();
        for (Definicao lista : dicionario.ConsultaIni(palavra)) {
            System.out.println("Palavra: " + lista.getPalavra() + " - Tradução: " + lista.getTraducao());
        }
        System.out.println("\n");
        MenuPrincipal();
    }
    public static void Quantidade(){
        System.out.println("Quantidade: " + dicionario.size() + "\n");
        MenuPrincipal();
    }
}