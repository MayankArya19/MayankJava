package collections;
import java.util.*;

public class BalancedStack {

	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.push("}");
		st.push("]");
		st.push(")");
		st.push("(");
		st.push("[");
		st.push("{");
		
		if(st.size()%2!=0) {
			System.out.println("Stack is not balanced");
		}
		else {
			
			
		}
	}
	
	

}
