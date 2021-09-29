package lab14;

import java.util.HashMap;

public class Program1 {
	boolean checkForKey(String keyToBeChecked)
    {
 
        // initializing the hashmap
        HashMap<String, Integer> hashMap =new HashMap<>();
 
        // filling the key - value pairs in hashmap
        hashMap.put("first", 1);
        hashMap.put("second", 2);
        hashMap.put("third", 3);
        hashMap.put("fourth", 4);
 
        // variable to store the boolean value
        // for result
        boolean result
            = hashMap.containsKey(keyToBeChecked);
 
        // returning the result
        return result;
    }

	public static void main(String[] args) {
		Program1 p1 = new Program1();
		 
        // displaying and calling the checkForKey()
        // method
        System.out.println(p1.checkForKey("fourth"));

	}

}
