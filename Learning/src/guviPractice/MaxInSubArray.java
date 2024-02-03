package guviPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxInSubArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		int i=0;
		while(i<n)
		{
			ArrayList<Integer> lis = new ArrayList<>();
			for(int j=0;j<=i;++j)
			{
				lis.add(arr[j]);
			}
			Collections.sort(lis);
			System.out.println(lis);
			if(lis.get(lis.size()-1)>k)
			{
				count++;
			}
			i++;
		}
		System.out.println(count);

	}

}
