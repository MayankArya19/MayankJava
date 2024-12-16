package strings;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="Mayank";
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		for(int j=str.length()-1;j>=0;j--) {
			System.out.print(str.charAt(j));
		}
	}

}
