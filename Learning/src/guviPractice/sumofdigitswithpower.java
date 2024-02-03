package guviPractice;

import java.util.Scanner;

public class sumofdigitswithpower {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int len=0,a=n;
		while(n>0)
		{
			len++;
			n=n/10;
		}
		int sum=0;
		while(a>0)
		{
			int count=0;
			int x=a%10,res=1;
			while(count<len)
			{
				
				count++;
				res=res*x;
				
			}
			System.out.println(res);
			sum=sum+res;
			a=a/10;
		}
		System.out.println(sum);

	}

}
