package Semana_13;

/**
 *
 * @author thomazpicelli
 */
public class HashTableEntry <E>{
    private E value; //Valor relativo à entrada
    
    public HashTableEntry(E value){
        this.value = value;
    }
    public E value() {
        return value;
    }
}
