package guviPractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class panNumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", str))
		{
			System.out.println("PAN");
		}
		else
		{
			System.out.println("Not Pan");
		}
	}

}
