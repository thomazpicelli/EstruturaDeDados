package Dicionario;

/**
 *
 * @author thomazpicelli e marcelooliveira
 * @param <E>
 */
public class HashTableEntry <E>{
    private Definicao definicao;
    
    public HashTableEntry(Definicao definicao){
        this.definicao = definicao;
    }
    
    public Definicao getDefinicao() {
        return definicao;
    }

    public void setDefinicao(Definicao definicao) {
        this.definicao = definicao;
    }
}