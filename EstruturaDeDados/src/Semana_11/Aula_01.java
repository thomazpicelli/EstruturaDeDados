package Semana_11;

/**
 * @see Pilha usando lista ligada generica
 * @author thomazpicelli
 */
public class Aula_01 {
    public static void main(String[] args) {
        Pilha <String> pilha = new Pilha<String>();
        try {
            System.out.println("aaaa");
            pilha.push("Cobra");
            pilha.push("Gato");
            pilha.push("Coelho");
            pilha.push("Vaca");
            System.out.println(pilha.top().getElemento());
            pilha.pop();
            System.out.println(pilha.top().getElemento());
            pilha.mostraLista();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}