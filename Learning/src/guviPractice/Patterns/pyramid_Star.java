package guviPractice.Patterns;

import java.util.Scanner;

public class pyramid_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;++i)
		{
			for(int s=1;s<=n-i;++s)
			{
				System.out.print(" ");
			}
			for(int st =1;st<=(2*i)-1;++st)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	/*
					  *  		      
				     ***
				    *****
				   *******
				  *********
				 ***********
				*************
				
				Logic is i-index, sp-Space, st - Star/Pattern
			
				i   sp	 st
					
				1	4	 1
				2	3	 3
				3	2	 5
				4	1	 7
				5	0	 9
		
	 */

}
