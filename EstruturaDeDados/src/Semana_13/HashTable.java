package Semana_13;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author thomazpicelli
 */
public class HashTable <E> {
    private ArrayList<LinkedList<HashTableEntry<E>>> conjunto; //arranjo de Listas Ligadas
    private int tamanho;

    public HashTable(int c){
        conjunto = new ArrayList<LinkedList<HashTableEntry<E>>>(c);
        for(int i=0;i<c;i++)
            conjunto.add(new LinkedList<HashTableEntry<E>>());
        tamanho = 0;
    }
    public int size(){
        return tamanho;
    }   
    public LinkedList<HashTableEntry<E>> get(int key){
        return conjunto.get(key);
    }
    public void put(E valor) {
        int a = (Integer) valor % 10;
        LinkedList<HashTableEntry<E>> lista = get(a);
        lista.add(new HashTableEntry<>(valor));
        conjunto.set(a, lista);
        System.out.println("Inserido com sucesso!");
        tamanho++;
    }
    public void remove(E valor){
        int a = (Integer) valor % 10;
        LinkedList<HashTableEntry<E>> lista = get(a);
        boolean remove = lista.remove(new HashTableEntry<>(valor));
        if(remove){
            conjunto.set(a, lista);
            System.out.println("remoção com sucesso!");
            tamanho--;
        }
        else
            System.out.println("Elemento inexistente!");
    }
}