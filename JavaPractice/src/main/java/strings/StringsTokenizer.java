package strings;

import java.util.StringTokenizer;

public class StringsTokenizer {
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("My name is Mayank", " ");
		//StringTokenizer st1 = new String
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
