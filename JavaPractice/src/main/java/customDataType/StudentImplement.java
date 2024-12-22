package customDataType;

import java.util.ArrayList;
import java.util.*;

public class StudentImplement {
	
	public static void main(String[] args) {
		
		Student s1= new Student("St1","1", "XII",new String[]{"English",	"Maths"});
		Student s2= new Student("St2","2", "XII",new String[]{"English",	"Maths"});
		Student s3= new Student("st3","3", "XII",new String[]{"English",	"Maths"});
		Student s4= new Student("st4","4", "XII",new String[]{"English",	"Maths"});
		
		List<Student> sList=new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		
		Iterator itr=sList.iterator();
		
		while(itr.hasNext()) {
			System.out.println("============================");
			Student s=(Student)itr.next();
			System.out.println(s);
			System.out.println("Name:- " + s.getName());
			System.out.println("Class:- " + s.getClassName());
			System.out.println("Roll Number:- "+ s.getRollNo());
			for(String st:s1.getSubjects()) {
				System.out.print(st+ " , ");
			}
			System.out.println();
		}
		
		
		
		
		

		
//		System.out.println(s1);
//		System.out.println(s1.getName());
//		
//		s1.setName("Arya");
//		System.out.println(s1.getName());
//		//System.out.println(s1.getSubjects());
//		
//		for(String s:s1.getSubjects()) {
//			System.out.println(s);
//		}
//		
		
	}

}
