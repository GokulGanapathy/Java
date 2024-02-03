package guviPractice;

import java.util.*;
public class RomanToInteger {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int res=0;
		for(int i=str.length()-1;i>=0;--i)
		{
			char ch=str.charAt(i);
			int x=integer(ch);
			//System.out.println(x);
			if(i!=0)
			{
				if((ch=='X'||ch=='V') && str.charAt(i-1)=='I')
				{
					x=x-1;
					i--;
				}
				else if((ch=='L'||ch=='C') && str.charAt(i-1)=='X')
				{
					x=x-10;
					i--;
				}
				else if((ch=='D'||ch=='M') && str.charAt(i-1)=='C')
				{
					x=x-100;
					i--;
				}
			}
			res=res+x;
			//System.out.println(res);
			
		}
		System.out.println(res);
		sc.close();
		
	}
	
	public static int integer(char ch)
	{
		int x=0;
		switch(ch) {
		case 'I':
			x=1;
			break;
		case 'V':
			x=5;
			break;
		case 'X':
			x=10;
			break;
		case 'L':
			x=50;
			break;
		case 'C':
			x=100;
			break;
		case 'D':
			x=500;
			break;
		case 'M':
			x=1000;
			break;
		}
		return x;
	}

}
