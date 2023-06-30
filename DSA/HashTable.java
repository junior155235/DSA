import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(100, "Jake");
        table.put(123, "Steve");
        table.put(321, "Sandy");
        table.put(555, "Dacy");
        table.put(777, "Jacob");

        // table.keySet()回傳所有key value
        for (int i : table.keySet()) {
            System.out.println("table.get(" + i + "): " + table.get(i));
        }

        // remove entry
        table.remove(777);

        // table.keySet()回傳所有key value
        for (int i : table.keySet()) {
            System.out.println("table.get(" + i + "): " + table.get(i));
        }
    }
}
