package guviPractice;

import java.util.Scanner;

public class StringToIntergerATOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.trim();
		
		if(str.length()==0 || Character.isAlphabetic(str.charAt(0)))
		{
			System.out.println("False");
		}
		else if(str.contains("+") && str.contains("-"))
		{
			System.out.println("False");
		}
		else
		{
			boolean temp=true;
			long res=0;
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			for(int i=0;i<str.length();++i)
			{
				
				if(Character.isAlphabetic(str.charAt(i)))
				{
					continue;
				}
				else if(Character.isDigit(str.charAt(i)))
				{
					if(res-1>Integer.MAX_VALUE)
					{
						res=Integer.MAX_VALUE;
						break;
					}
					else
					{
						res=res*10;
						res=res+Integer.parseInt(Character.toString(str.charAt(i)));
						//System.out.println("i is :"+i+" and the result is "+res);
					}
				
				}
				else if(str.charAt(i)=='+')
				{
					temp=true;
				}
				else if(str.charAt(i)=='-')
				{
					temp=false;
				}
				else if(str.charAt(i)==' ')
				{
					continue;
				}

				else
				{
					break;
				}
			}
			//System.out.println(res);
			
			res= (temp==true)?res:(res*(-1));
			int res1=(int)res;
			System.out.println("Result is :"+res1);
			if(res>=Integer.MAX_VALUE)
			{
				res1=res1-1; 
			}
			else if(res-1<=Integer.MIN_VALUE)
			{
				res1=res1-1;
			}
			System.out.println("Result is :"+res1);
			
			
			
		}
		
	}

}
