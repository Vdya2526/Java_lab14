package lab14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program4 {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();
	      myMap.put(1, "Java");
	      myMap.put(2, "pearl");
	      myMap.put(3, "C");
	      myMap.put(4, "C#");

	      ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());
	      ArrayList<String> valueList = new ArrayList<String>(myMap.values());

	      System.out.println("contents of the list holding keys the map ::"+keyList);
	      System.out.println("contents of the list holding values of the map ::"+valueList);
		
		
	}}