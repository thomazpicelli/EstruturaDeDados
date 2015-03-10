package Semana_03.Aula_03;

/**
 *
 * @author thomazpicelli
 */
public class Lista {
    public Vendedor[] lista;
    public int qtde;

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
        for (int i = 0; i < qtde; i++) {
            if(lista[i].getCodigo() == codigo){
                consulta = lista[i];
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
        lista[qtde] = novo;
        this.qtde++;
    }
    
    public int consultaPosicao(int codigo) throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia");
        }
        for (int i = 0; i < qtde; i++) {
            if(codigo == lista[i].getCodigo()) return i;
        }
        return -1;
    }    
    
    public void removeElemento(int codigo) throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        int posi = consultaPosicao(codigo);
        if(posi == -1) throw new Exception("O elemento que deseja remover não está na lista!");
        else{
            for (int i = posi; i < qtde; i++) {
                lista[i] = lista[i+1];
            }
            this.qtde--;
        }
    }
    
    public void alterarVendedor(int codigo, Vendedor novo) throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        int posi = consultaPosicao(codigo);
        if(posi == -1) throw new Exception("Elemento que deseja alterar não está na lista!");
        else{
            lista[posi] = novo;
        }    
    }
    
    public Vendedor[] ordenaNome(Vendedor[] lista) throws Exception{  
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        Vendedor aux = null; int j;
        for (int i=1; i< qtde ; i++){
            aux = lista[i];
            for(j=i-1; j>=0 && aux.getNome().compareTo(lista[j].getNome())<0; j--){
                lista[j+1] = lista[j];
            }
            lista[j+1] = aux;
	}
        return lista;  
    }
    
    public void mostraLista() throws Exception{
        if(verVazia()){
            throw new Exception("Lista está vazia!");
        }
        lista = ordenaNome(lista);
        for (Vendedor lista1 : lista) {
                System.out.println("Vendedor: " + lista1.getNome() + ", " + lista1.getCodigo() + ", " + lista1.getVenda() + ".");
        }
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
    
}
