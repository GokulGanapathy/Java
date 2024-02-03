package Learn;
import java.util.*;

public class genericCall {

	public static void main(String[] args) {
		
		/*
		 * We are using the same class
		 * we called for different ways with same class and called as like a List
		 * All data types have been working on it
		 */
		
		Scanner sc=new Scanner(System.in);
		
		genericClassMethod<Integer> res=new genericClassMethod<>();
		res.output(10, 20, 30);
		
		genericClassMethod<String> res1=new genericClassMethod<>();
		res1.output("Output", "Is", "String");
		
		genericClassMethod<Boolean> res2=new genericClassMethod<>();
		res2.output(true, false, true);
	}

}
