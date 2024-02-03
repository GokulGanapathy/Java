package guviPractice;

import java.util.Scanner;

public class removeDuplfromSortedArr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<n;++i)
		{
			if(arr[count]<arr[i])
			{
				count++;
				arr[count]=arr[i];
			}
		}
		System.out.println(count+1);
		for(int i=0;i<count+1;++i)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
