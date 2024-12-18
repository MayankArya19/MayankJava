package collections;

import java.util.*;

public class LinkedHashSetInJava {
	
	public static void main(String[] args) {
		
		Set<Integer> tset=new LinkedHashSet<>();
		tset.add(1);
		tset.add(1);
		tset.add(2);
		tset.add(5);
		tset.add(null);
		
		System.out.println(tset);
	}

}
