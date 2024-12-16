package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
	
	public static void main(String[] args) {
		
		List<String> str=new ArrayList<>();
		
		str.add("Mango");
		str.add("Mango2");
		str.add("Mango3");
		str.add("Mango4");
		
		System.out.println(str);
		for(String s: str) {
			System.out.println(s);
		}
		
		System.out.println("==================================");
		
		Iterator<String> itr = str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
