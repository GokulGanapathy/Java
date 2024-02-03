package guviAssignment;

import java.util.Scanner;

public class stringEquals{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		if(str==str1)
		{
			System.out.println("The Both String is ==");
		}
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("The Both String is equal");
		}
	}

}
