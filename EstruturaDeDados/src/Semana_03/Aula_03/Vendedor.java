package Semana_03.Aula_03;

/**
 * @see Implementação da teoria de TAD
 * @author thomazpicelli
 */
public class Vendedor {
    public static Vendedor lista[];
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
    
    public static Vendedor[] getLista() {
        return lista;
    }

    public static void setLista(Vendedor[] aLista) {
        lista = aLista;
    }
    
    public Vendedor(int codigo, String nome, double venda) {
        this.codigo = codigo;
        this.nome = nome;
        this.venda = venda;
    }
    
    public void iniciaLista(){
        Vendedor lista[] = new Vendedor[50];
    }
    
    public boolean verCheia(){
        int tam = verTamanho();
        if(lista.length-1 == tam) return true; else return false;
    }
    
    public boolean verVazia(){
        if(lista[0] == null) return true; else return false;
    }
    
    public int verTamanho(){
        int tam = 0;
        boolean vazia = verVazia();
        if(vazia != true){
            for (Vendedor lista1 : lista) {
                if(lista1 != null) tam++;
            }
        }
        else tam = 0;
        return tam;
    }
    
    public void insereElemento(Vendedor novo){
        Vendedor verifica;
        int posicao = verTamanho();
        boolean cheia = verCheia();
        if(cheia != true){
            verifica = consultaVendedor(novo.getCodigo());
            if(verifica == null){
                lista[posicao] = novo;
            }
            else System.out.println("Vendedor já existe!");
        }
            else System.out.println("Lista de vendedor cheia");
    }
    
    public void removeElemento(int codigo){
        Vendedor consulta;
        boolean vazia = verVazia();
        if(vazia != true){
            consulta = consultaVendedor(codigo);
            if (consulta != null){
                for (int i = 0; i < lista.length; i++){
                    if(consulta.getCodigo() == codigo){
                        for (int j = i; j < lista.length; j++) {
                            lista[j] = lista[j+1];
                        }
                    }
                }
            }
            else System.out.println("Vendedor que deseja excluir na existe na lista");
        }
        else System.out.println("Lista vazia!");
    }
    
    public Vendedor verMaior(){
        double maiorVenda = 0;
        Vendedor maior = null;
        boolean vazia = verVazia();
        if(vazia != true){
            for (Vendedor lista1 : lista) {
                if(lista1.getVenda()>maiorVenda){
                    maior = lista1;
                    maiorVenda = lista1.getVenda();
                }
            }
        }
        return maior;
    }
    
    public Vendedor verMenor(){
        double menorVenda = Double.MAX_VALUE;
        Vendedor menor = null;
        boolean vazia = verVazia();
        if(vazia != true){
            for (Vendedor lista1 : lista) {
                if(lista1.getVenda()<menorVenda){
                    menor = lista1;
                    menorVenda = lista1.getVenda();
                }
            }
        }
        return menor;
    }

    public double mediaVendas(int codigo){
        double total = 0, media = 0;
        int tam = verTamanho();
        boolean vazia = verVazia();
        if(vazia != true){
            for (Vendedor lista1 : lista) {
                total += lista1.getVenda();
            }
            media = total/tam;
        }
        return media;
    }
    
    public Vendedor consultaVendedor(int codigo){
        Vendedor consulta = null;
        boolean vazia = verVazia();
        if(vazia != true){
            for (Vendedor lista1 : lista) {
                if(lista1.getCodigo() == codigo){
                    consulta = lista1;
                }
            }
        }
        return consulta;
    }
    
    public void alterarVendedor(int codigo, Vendedor novo){
        boolean vazia = verVazia();
        if(vazia != true){
            Vendedor consulta = consultaVendedor(codigo);
            if (consulta != null){
                for (Vendedor lista1 : lista) {
                    if(lista1.getCodigo() == codigo){
                        lista1 = novo;
                    }
                }
            }
            else System.out.println("Não existe vendedor com este codigo");
        }
        else System.out.println("Lista vazia!");
    }
    
    public double somaVendas(){
        double soma = 0;
        boolean vazia = verVazia();
        if(vazia != true){
            for (Vendedor lista1 : lista) {
                soma += lista1.getVenda();
            }
        }
        else System.out.println("Lista vazia!");
        return soma;
    }
    
    public void mostraLista(){
        boolean vazia = verVazia();
        if(vazia != true){
            for (Vendedor lista1 : lista) {
                System.out.println("Vendedor: " + lista1.getNome() + ", " + lista1.getCodigo() + ", " + lista1.getVenda() + ".");
            }
        }
    }
}