package guviPractice;

import java.util.Scanner;

public class balancedString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int temp=0;
		for(int i=0;i<str.length()-1;++i)
		{
			char ch=str.charAt(i);
			char exp=' ';
			switch (ch) {
			case '[':
				exp=']';
				break;
			case '{':
				exp='}';
				break;
			case '(':
				exp=')';
				break;
			}
			//int temp1=0;
			for(int j=i+1;j<str.length();++j)
			{
				if(str.charAt(j)==exp)
				{
					if((j-i)%2!=0)
					{
						//System.out.println(j-i);
						temp=1;
						break;
					}
					else
					{
						temp=0;
						break;
					}
				}
				else if(str.charAt(j)==ch)
				{
					j++;
				}
			}
			
			if(temp==1)
			{
				//temp=1;
				continue;
				
			}
			else
			{
				//temp=0;
				break;
			}
		}
		if(temp==0 || str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)=='['||str.charAt(str.length()-1)=='{')
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}

}
