package Semana_10;

/**
 * @see Lista duplamente ligada
 * @author thomazpicelli
 */
public class Aula_01 {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        try {
            lista.addFirst("Cobra");
            lista.addLast("Boi");
            lista.addBefore("Gato", "Cobra");
            lista.addAfter("Coelho", "Boi");
            lista.addAfter("Vaca", "Cobra");
            System.out.println(lista.first());
            System.out.println(lista.last());
            System.out.println("");
            lista.mostraLista();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
