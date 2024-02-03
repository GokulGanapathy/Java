package guviPractice;

import java.util.Scanner;

public class PatternAlphaStar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n-1;
		int y=n-1;
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n+n-1;++j)
			{
				if(j>=x && j<=y)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("b");
				}
			}
			x--;
			y++;
			System.out.println();
		}

	}

}
