package collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapInJava {
	
	public static void main(String[] args) {
		
		Map<String, String> hmap = new HashMap<>();
		
		hmap.put("Name", "Arya");
		hmap.put("Age", "27");
		hmap.put("Job", "EY");
		
		System.out.println(hmap);
		for(Entry<String, String> entrySet: hmap.entrySet()) {
			System.out.println(entrySet.getKey());
			System.out.println(entrySet.getValue());
			System.out.println("-----------------");
			
		}
		
	}

}
