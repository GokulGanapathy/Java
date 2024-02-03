package guviPractice;

import java.util.*;


public class ReverseWithoutSpaceChanges {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		for(int i=0;i<str.length();++i)
		{
			char ch=str.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				str1=str1+Character.toString(ch);
			}
			else
			{
				continue;
			}
		}
		int len=str1.length()-1;
		for(int i=0;i<str.length();++i)
		{
			char ch=str.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				System.out.print(str1.charAt(len));
				len--;
			}
			else
			{
				System.out.print(str.charAt(i));
			}
		}

	}

}
