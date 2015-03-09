package Semana_03.Aula_03;

/**
 *
 * @author thomazpicelli
 */
public class Lista {
    Vendedor[] lista;
    int qtde;

    public Lista(int qtde) {
        this.lista = new Vendedor[qtde];
        this.qtde = 0;
    }
    
    public void iniciaLista(){
        this.qtde = 0;
    }
    
    public boolean verCheia(){
        return lista.length == this.qtde;
    }
    
    public boolean verVazia(){
        return this.qtde == 0;
    }
    
    public int verTamanho(){
        return this.qtde;
    }
    
    public Vendedor consultaVendedor(int codigo) throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia");
        }
        Vendedor consulta = null;
        for (Vendedor lista1 : lista) {
            if(lista1.getCodigo() == codigo){
                consulta = lista1;
            }
        }
        return consulta;
    }
    
    public void insereElemento(Vendedor novo) throws Exception{
        if(verCheia()){
            throw new Exception("Lista cheia - não é possivel inserir elemento");
        }
        if (this.qtde > 0){
            if(consultaVendedor(novo.getCodigo()) != null){
                throw new Exception("Elemento já existe na lista");
            }
        }
        lista[qtde-1] = novo;
        this.qtde++;
    }
    
    public void removeElemento(int codigo) throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia");
        }
        if(consultaVendedor(codigo) == null){
            throw new Exception("O elemento que deseja remover não está na lista");
        }
    }
    
    public void alterarVendedor(int codigo, Vendedor novo){
        
    }
    
    public Vendedor verMaior() throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        double maiorVenda = 0;
        Vendedor maior = null;
        for (Vendedor lista1 : lista) {
            if(lista1.getVenda()>maiorVenda){
                maior = lista1;
                maiorVenda = lista1.getVenda();
            }
        }
        return maior;
    }
    
    public Vendedor verMenor() throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        double menorVenda = Double.MAX_VALUE;
        Vendedor menor = null;
        for (Vendedor lista1 : lista) {
            if(lista1.getVenda()<menorVenda){
                menor = lista1;
                menorVenda = lista1.getVenda();
            }
        }
        return menor;
    }

    public double mediaVendas(int codigo) throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        double total = 0, media;
        for (Vendedor lista1 : lista){
            total += lista1.getVenda();
        }
        media = total/this.qtde;
        return media;
    }
    
    public double somaVendas() throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        double soma = 0;
        for (Vendedor lista1 : lista) {
            soma += lista1.getVenda();
        }
        return soma;
    }
    
    public void mostraLista() throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        for (Vendedor lista1 : lista) {
                System.out.println("Vendedor: " + lista1.getNome() + ", " + lista1.getCodigo() + ", " + lista1.getVenda() + ".");
        }
    }

    void insereElemento(int i, String jomar, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
