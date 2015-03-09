package Semana_03.Aula_03;

/**
 *
 * @author thomazpicelli
 */
public class ProdVendedor {
    public static void main(String[] args) {
        Lista lista = new Lista(5);
        try {
            lista.insereElemento(1, "João", 2000);
            lista.insereElemento(2, "Jose", 20);
            lista.insereElemento(3, "Josefina", 100);
            lista.insereElemento(4, "Jomar", 2);
            System.out.println("Qtde de vendedores: " + lista.verTamanho());
            System.out.println("Maior Venda: " + lista.verMaior());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
