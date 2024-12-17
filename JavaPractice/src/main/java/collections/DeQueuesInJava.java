package collections;

import java.util.*;

public class DeQueuesInJava {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.add(4);
		
		System.out.println(dq);
		
		dq.addFirst(0);
		dq.addFirst(-1);
		dq.addLast(90);
		dq.addLast(100);
		System.out.println(dq);
		
		
		
	}

}
