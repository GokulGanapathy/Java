package guviPractice;

import java.util.Scanner;

public class perfectNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		perfectNum obj=new perfectNum();
		for(int i=n+1;;++i)
		{
			int res=(int)Math.sqrt(i);
			if(Math.sqrt(i)%2==0 && obj.power(res)==i )
			{
				System.out.println(i);
				break;
			}
		}
		/*int x=(int)Math.sqrt(n);
		perfectNum obj=new perfectNum();
		int res=obj.power(x);
		System.out.println(res);*/
	}
	
	public int power(int n)
	{
		int base=2;
		int res=1;
		for(int i=0;i<n;++i)
		{
			res=res*base;
		}
		return res;
	}

}
