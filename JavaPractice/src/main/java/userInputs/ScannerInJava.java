package userInputs;

import java.util.Scanner;

public class ScannerInJava {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter number");
		int i=sc.nextInt();
		
		//System.out.println("Enter 2nd number");
		int j=sc.nextInt();
		
		System.out.println(i+j);
		
		
	}

}
