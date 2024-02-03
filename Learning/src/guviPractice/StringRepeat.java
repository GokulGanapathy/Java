package guviPractice;

import java.util.Scanner;

public class StringRepeat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n:");
		int n=sc.nextInt();
		System.out.println("Enter the k:");
		int k=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;++i)
		{
			System.out.println("Enter "+i+"th Element:");
			arr[i]=sc.next();
		}
		int extemp=0;
		for(int i=0;i<n-1;++i)
		{
			int temp=0;
			for(int j=i;j<k;++j)
			{
				if(arr[i].equals(arr[j]))
				{
					temp=1;
				}
				else
				{
					temp=0;
					break;
				}
			}
			if(temp==1)
			{
				extemp=1;
				System.out.println("yes");
				break;
			}
			else
			{
				extemp=0;
			}
		}
		if(extemp==0)
		{
			System.out.println("no");
		}

	}

}
