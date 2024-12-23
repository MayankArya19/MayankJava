package oopsConcepts;

public class PolymorphismInJava {
	
	public static void main(String[] args) {
		
		Account ac1=new Account(123456789,"Savings","SBI",1000.5f);
		System.out.println(ac1);
		
		System.out.println(ac1.getData(1234567789, 123.45f));
		System.out.println(ac1.getData(""));
	}
	

}
