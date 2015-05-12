package Semana_13;

/**
 *
 * @author thomazpicelli
 */
public class Aaula_02 {
    public static void main(String[] args) {
        HashTable<Integer> th = new HashTable<Integer>(30);
        th.put(19);
        th.put(4);
        th.put(2);
        th.put(3);
        th.put(25);
        int a = th.size();
        System.out.println(a);
        th.remove(19);
    }
}
