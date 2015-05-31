package Dicionario;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author thomazpicelli e marcelooliveira
 */
public class Dicionario {
    private ArrayList<LinkedList<HashTableEntry>> conjunto;
    private int tamanho;

    public Dicionario(int c){
        conjunto = new ArrayList<LinkedList<HashTableEntry>>(c);
        for(int i=0;i<c;i++)
            conjunto.add(new LinkedList<HashTableEntry>());
        tamanho = 0;
    }
    
    public int size(){
        return tamanho;
    }
    
    public LinkedList<HashTableEntry> get(int key){
        return conjunto.get(key);
    }
    
    public int hashFunction(HashTableEntry entrada) {
        int a = Character.getNumericValue(entrada.getDefinicao().getPalavra().charAt(2));
        int b = entrada.getDefinicao().getTraducao().length();
        int r = (a + b)/b;
        return r;
    }
    
    public void Put(Definicao definicao) {
        for (LinkedList<HashTableEntry> conjunto1 : conjunto) {
            for (HashTableEntry conjunto11 : conjunto1) {
                if(conjunto11.getDefinicao().getPalavra().equals(definicao.getPalavra()) && conjunto11.getDefinicao().getTraducao().equals(definicao.getTraducao())){
                    System.out.println("Tradução já existe no dicionário!!");
                    return;
                }
            }
        }
        int result = hashFunction(new HashTableEntry(new Definicao(definicao.getPalavra(), definicao.getTraducao())));
        LinkedList<HashTableEntry> lista = get(result);
        lista.add(new HashTableEntry<>(definicao));
        conjunto.set(result, lista);
        System.out.println("Inserido com sucesso!\n");
        tamanho++;
    }
    
    public void Remove(String traducao){
        boolean remove = false;
        String palavra = ConsultaTrad(traducao);
        if(palavra != null){
            int result = hashFunction(new HashTableEntry(new Definicao(palavra, traducao)));
            LinkedList<HashTableEntry> lista = conjunto.get(result);
            if (!lista.isEmpty()) {
                for (HashTableEntry elemento : lista) {
                    if (elemento.getDefinicao().getPalavra().equals(palavra)) {
                        remove = lista.remove(elemento);
                        if(remove){
                            conjunto.set(result, lista);
                            tamanho--;
                            System.out.println("remoção com sucesso!\n");
                        }
                        else 
                            System.out.println("Elemento inexistente!\n");
                    }
                }
            }
        }
    }
    
    public String ConsultaTrad(String traducao){
        for (LinkedList<HashTableEntry> conjunto1 : conjunto) {
            for (HashTableEntry conjunto11 : conjunto1) {
                if(conjunto11.getDefinicao().getTraducao().equals(traducao))
                    return conjunto11.getDefinicao().getPalavra();
            }
        }
        return null;
    }
    
    public ArrayList<Definicao> ConsultaIni(String trad){
        ArrayList<Definicao> lista = new ArrayList<Definicao>();
        for (LinkedList<HashTableEntry> conjunto1 : conjunto) {
            for (HashTableEntry conjunto11 : conjunto1) {
                if(conjunto11.getDefinicao().getTraducao().startsWith(trad))
                   lista.add(conjunto11.getDefinicao());
            }
        }
        return lista;
    }
}