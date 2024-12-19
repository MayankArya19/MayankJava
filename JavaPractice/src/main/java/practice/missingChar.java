package practice;

import java.util.Scanner;

public class missingChar {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int a=sc.nextInt();
		String str2=newString(str,a);
		System.out.println(str2);
	}
	
	public static String newString(String str, int a) {
		
		for(int i=0;i<str.length();i++) {
			if(i==a) {
				str=str.replace(Character.toString(str.charAt(a)), "");
				return str;
			}
		}
		
		return str;
		
	}

}
