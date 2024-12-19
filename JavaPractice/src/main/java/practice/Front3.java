package practice;

public class Front3 {
	
	public static void main(String[] args) {
		String str="ab234";
		System.out.println(changeStr(str));
		
		
		
	}
	public static String changeStr(String str) {
		StringBuilder str1 = new StringBuilder();
		if(str.length()>=3) {
			for(int i=0;i<3;i++) {
				str1.append(str.subSequence(0, 3));
			}
		}
		else {
			for(int i=0;i<3;i++) {
				str1.append(str);
			}
		}
		
		return str1.toString();
		}

}
