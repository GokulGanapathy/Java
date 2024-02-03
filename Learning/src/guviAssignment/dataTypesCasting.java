package guviAssignment;

import java.util.Scanner;

public class dataTypesCasting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Integer.MAX_VALUE);
		
		float f=(float)num;
		System.out.println("Int to Float : "+f);
		
		int n=(int)f;
		System.out.println("float to int : "+n);
		
		double d=(double)num;
		System.out.println("Int to Double : "+d);
		
		int n1=(int)d;
		System.out.println("double to int : "+n1);
		
		char ch=(char)num;
		System.out.println("Int to Char : "+ch);
		
		int n2=(int)ch;
		System.out.println("char to int : "+n2);
	}

}
