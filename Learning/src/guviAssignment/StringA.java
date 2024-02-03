package guviAssignment;

import java.util.Scanner;

public class StringA{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		NumString obj=new NumString(num);
		obj.print(num);
		
	}

}
