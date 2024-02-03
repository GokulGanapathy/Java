package guviPractice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		int n;
        if(x<0)
        {
            n=(x*-1);
        }
        else
        {
            n=x;
        }
        long res=0;
        while(n>0)
        {
            int temp=n%10;
            res=(res*10)+temp;
            n=n/10;
        }
        if(res>=Integer.MAX_VALUE)
        {
            System.out.println("0");
        }
        else
        {
            if(x<0)
            {
            	System.out.println(res*(-1));
            }
            else
            {
            	System.out.println(res);
            }
        }
        

	}

}
