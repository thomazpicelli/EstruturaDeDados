package Semana_09;

/**
 *
 * @author thomazpicelli
 */
public class Aula_01 {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.addFirst("Porco");
        lista.addFirst("Zebra");
        lista.addFirst("Cobra");
        lista.addFirst("Gato");
        System.out.println("Primeiro: " + lista.first().getNomeAnimal());
        System.out.println("Ultimo: " + lista.last().getNomeAnimal());
        lista.addFirst("Boi");
        System.out.println("Primeiro2: " + lista.first().getNomeAnimal());
        System.out.println("Ultimo2: " + lista.last().getNomeAnimal());
        lista.addLast("Peixe");
        System.out.println("Primeiro3: " + lista.first().getNomeAnimal());
        System.out.println("Ultimo3: " + lista.last().getNomeAnimal());
    }
}
