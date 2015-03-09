package Semana_03.Aula_03;

/**
 * @see Implementação da teoria de TAD
 * @author thomazpicelli
 */
public class Vendedor {
    private int codigo;
    private String nome;
    private double venda;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }
    
    public Vendedor(int codigo, String nome, double venda) {
        this.codigo = codigo;
        this.nome = nome;
        this.venda = venda;
    }

    public void mostraDados(){
        System.out.println("Codigo:" + codigo);
        System.out.println("Nome..: " + nome);
        System.out.println("Valor.: " + venda);
    }
}