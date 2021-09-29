package lab14;

import java.util.Hashtable;

public class Program3 {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		 
		hashtable.put(1, "One");
		hashtable.put(2, "Two");
		hashtable.put(3, "Three");
		 
		/*remove method will remove the key value
		 */
		 
		
		System.out.println( hashtable.remove(2) );
		 
		//this will return null as the key 5 does not exist
		System.out.println( hashtable.remove(5) );
		 
		System.out.println("Hashtable contains: " + hashtable);
System.out.println(hashtable);
	}

}
