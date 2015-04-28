package Semana_11.Aula_02;

/**
 *
 * @author thomazpicelli
 */
public class FilaLigada {
    public static void main(String[] args) {
        try {
            Fila<String> fila = new Fila<String>();
            fila.enqueue("Boi");
            fila.enqueue("Vaca");
            fila.enqueue("Cobra");
            fila.mostraLista();
            fila.dequeue();
            System.out.println(fila.front().getElemento());
            fila.mostraLista();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}