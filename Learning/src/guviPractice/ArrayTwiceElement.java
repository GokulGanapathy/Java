package guviPractice;

import java.util.Scanner;

public class ArrayTwiceElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;++i)
		{
			int count=0;
			for(int j=0;j<n;++j)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	
		
		sc.close();
	}

}
