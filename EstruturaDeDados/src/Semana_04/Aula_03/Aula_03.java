package Semana_04.Aula_03;

/**
 * @see Implementação dos conceitos de Pilha
 * @author thomazpicelli
 */
public class Aula_03 {
    public static void main(String[] args) {
        Stack pilha = new Stack(5);
        try {
            pilha.push(11);
            pilha.push(13);
            pilha.push(22);
            pilha.push(33);
            pilha.push(44);
            System.out.println("Quantidade: " + pilha.size());
            System.out.println("Elemento do topo: " + pilha.top());
            pilha.pop();
            System.out.println("Elemento do topo: " + pilha.top());
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
