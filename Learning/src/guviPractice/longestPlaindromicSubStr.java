package guviPractice;

import java.util.Scanner;

public class longestPlaindromicSubStr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int max=0;
		String res="";
		for(int i=0;i<str.length();++i)
		{
			for(int j=i+1;j<=str.length();++j)
			{
				String substr=str.substring(i, j);
				System.out.println("The SbString is :"+substr);
				if(substr.length()>max)
				{
					if(isPalindrome(substr)==true)
					{
						max=substr.length();
						res=substr;
					}
				
				}
			}
		}
		System.out.println(res);
	}
	
	public static boolean isPalindrome(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String res=sb.toString();
		boolean val;
		if(res.equals(str))
		{
			val=true;
		}
		else
		{
			val=false;
		}
		return val;
	}

}
