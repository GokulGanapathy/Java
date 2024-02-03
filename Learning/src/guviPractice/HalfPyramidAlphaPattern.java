package guviPractice;

import java.util.Scanner;

public class HalfPyramidAlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		char ch=(char)(64+n);
		for(int i=0;i<n;++i)
		{
			ch=(char)(64+n);
			for(int j=0;j<x;++j)
			{
				System.out.print(ch);
				ch--;
			}
			x--;
			System.out.println();
		}

	}

}
