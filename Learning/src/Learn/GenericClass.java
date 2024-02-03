package Learn;
import java.util.*;

public class GenericClass<T> {			//Defining the our variable in class as <name>
	
	private T num1;						//Instantiating that Variables
	private T num2;
	
	void print(T num1,T num2) {			//Using Generic Variables
		System.out.print(num1);
		System.out.print(num2);
		//System.out.print(num1+num2);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		GenericClass<Integer> arrlis=new GenericClass<>();
		arrlis.print(n1, n2);
		
		GenericClass<String> arrliststr=new GenericClass<>();
		arrliststr.print("Gokul","Learns");
	}

}
