package Learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arraysmerge {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		for(int i=0;i<n;++i)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<m;++i)
		{
			arr2[i]=sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<n;++i)
		{
			System.out.print(arr1[i]+" ");
		}
		for(int i=m-1;i>0;--i)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.print(arr2[0]);
		
	}

}
