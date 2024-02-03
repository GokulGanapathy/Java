package Learn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AlternateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		//int res = n%2==0 ? (n/2):((n/2)+1);
		for(int i=0;i<(n/2);++i)
		{
			System.out.print(arr[n-i-1]+" ");
			
			if(n%2==0)
			{
				if(i<((n/2)-1))
				{
					System.out.print(arr[i]+" ");
				}
				else
				{
					System.out.print(arr[i]);
				}
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		if(n%2!=0)
		{
			System.out.print(arr[n/2]);
		}

	}

}
