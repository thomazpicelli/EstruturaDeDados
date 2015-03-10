package Semana_03.Aula_03;

/**
 *
 * @author thomazpicelli
 */
public class ProdVendedor{
    public static void main(String[] args) {
        Lista lista = new Lista(5);
        try {
            lista.insereElemento(new Vendedor(1, "Zoão", 2000));
            lista.insereElemento(new Vendedor(2, "Aose", 20));
            lista.insereElemento(new Vendedor(3, "Bosefina", 100));
            lista.insereElemento(new Vendedor(4, "Comar", 2));
            //lista.removeElemento(3);
            lista.mostraLista();
            //System.out.println("Qtde de vendedores: " + lista.verTamanho());
            //System.out.println("Maior Venda: " + lista.verMaior());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
