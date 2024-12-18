package collections;

import java.util.*;

public class SetsInJava {
	
	public static void main(String[] args) {
		
		Set<String> hset=new HashSet<>();
		
		hset.add("One");
		hset.add("Two");
		hset.add(null);
		hset.add("Four");
		hset.add("Four");
		
		System.out.println(hset);
		
	}

}
