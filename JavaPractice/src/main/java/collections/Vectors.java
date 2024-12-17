package collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("123");
		v.add("sda");
		v.add("edsf");
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
