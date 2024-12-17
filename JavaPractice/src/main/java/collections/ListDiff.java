package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDiff {
	
	public static void main(String[] args) {
		
		List<Float> alist = new ArrayList<>();
		List<Float> llist = new LinkedList<>();
		
		long startTime1=System.currentTimeMillis();
		
		for(int i=0; i<=10000;i++) {
			alist.add(123.4f);
			alist.add(100.23f);
			alist.add(12.5f);
			alist.add(213.6f);
			alist.add(21.6543f);
			
			alist.remove(2);
			alist.remove(2);
			
		}
		
		long endTime1=System.currentTimeMillis();
		
		System.out.println(alist.size());
		
		System.out.println(endTime1-startTime1);
		
long startTime2=System.currentTimeMillis();
		
		for(int j=0; j<=10000;j++) {
			llist.add(123.4f);
			llist.add(100.23f);
			llist.add(12.5f);
			llist.add(213.6f);
			llist.add(21.6543f);
			
			llist.remove(2);
			llist.remove(2);
			
		}
		
		long endTime2=System.currentTimeMillis();
		
		System.out.println(llist.size());
		
		System.out.println(endTime2-startTime2);
		
	}

}
