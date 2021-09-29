package lab14;

import java.util.Hashtable;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		 
        // Putting key-value pairs to HashTable object
        // custom entries
        ht.put(1, "orange");
        ht.put(2, "apple");
        ht.put(3, "mango");
        ht.put(4, "P");
        ht.put(5, "R");
 
        // Getting keySets of Hashtable and
        // storing it into Set
        Set<Integer> setOfKeys = ht.keySet();
        for (Integer key : setOfKeys) {
            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                               + "\t\t Name : "
                               + ht.get(key));

	}}

}
