package guviAssignment;

import java.util.Scanner;

public final class finalStringClass {  
	
	public final String city="chennai";
	
	public final void getValues(String str) {
		
		System.out.println(str+" "+city);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		finalStringClass f=new finalStringClass();
		//f.city="Tirunelveli";
		f.getValues(name);
		

	}

}
