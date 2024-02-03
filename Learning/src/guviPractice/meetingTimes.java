package guviPractice;

import java.util.Scanner;

public class meetingTimes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;++i)
		{
			arr2[i]=sc.nextInt();
		}
		int count=1;
		int prev=arr2[0];
		for(int i=1;i<n;++i)
		{
			if(arr1[i]>=prev)
			{
				count++;
				prev=arr2[i-1];
			}
		}
		System.out.println(count);

	}

}
