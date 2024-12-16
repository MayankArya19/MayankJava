package loops;

public class ForEachLoop {
	
	public static void main(String[] args) {
		String str= "My name is Mayank Arya";
		
		for(char c : str.toCharArray()) {
			System.out.println(c);
		}
	}

}
