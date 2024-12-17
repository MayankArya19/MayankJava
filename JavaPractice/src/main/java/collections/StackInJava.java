package collections;

import java.util.*;

public class StackInJava {
	
	public static void main(String[] args) {
		
		Stack<Integer> s= new Stack<>();
		
		for(int i=1;i<=5;i++) {
			
			s.push(i);
		}
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
	}

}
