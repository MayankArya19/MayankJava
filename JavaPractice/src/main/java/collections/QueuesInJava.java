package collections;

import java.util.*;

public class QueuesInJava {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> pq= new PriorityQueue<>();
		pq.add("C");
		pq.add("O");
		pq.add("D");
		System.out.println(pq);
		pq.remove();
		
		System.out.println(pq);
//		
//		System.out.println("Peek " + pq.peek());
//		
//		System.out.println("Poll "+ pq.poll());
//		System.out.println(pq);
		
		
	}

}
