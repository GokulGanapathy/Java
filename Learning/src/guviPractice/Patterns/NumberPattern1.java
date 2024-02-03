package guviPractice.Patterns;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n+n-1;
		int y=n-1;
		for(int i=0;i<n;++i)
		{
			int a=i;
			for(int j=0;j<x;++j)
			{
				if(j==y)
				{
					System.out.print(a);
					if(j<n-1)
					{
						a--;
					}
					else
					{
						a++;
					}
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			y--;
		}

	}

}
