package userInputs;

public class Input1 {
	
	public static void main(String[] args) {
		
		int res=0;
		for(String s : args) {
			int j=Integer.parseInt(s);
			res=res+j;
			//System.out.println(s);
		}
		System.out.println(res);		
	}

}
