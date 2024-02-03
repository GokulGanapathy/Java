package Learn;

import java.util.Arrays;
import java.util.*;

public class CountOfLongestSubSequentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<n;++i)
		{
			if(i==0)
			{
				if(arr[i+1]-arr[i]==1)
				{
					count++;
				}
			}
			else if(i==n-1)
			{
				if(arr[i]-arr[i-1]==1)
				{
					count++;
				}
			}
			else
			{
				if(arr[i]-arr[i-1]==1 ||  arr[i+1]-arr[i]==1)
				{
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
