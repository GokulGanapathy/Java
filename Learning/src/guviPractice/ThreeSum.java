package guviPractice;

import java.util.*;
public class ThreeSum {

	public static void main(String[] args) {
		int arr[]= {0,0,0};
		
		System.out.println(threeSum(arr));
		

	}
	public static List<List<Integer>> threeSum(int[] arr)
	{
		int n=arr.length;
		List<List<Integer>> lis = new ArrayList<>();
		
		for(int i=0;i<n-2;++i)
		{
			for(int j=i+1;j<n-1;++j)
			{
				for(int k=i+2;k<n;++k)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						List<Integer> sum = new ArrayList<>();
						
						sum.add(arr[i]);
						sum.add(arr[j]);
						sum.add(arr[k]);
						Collections.sort(sum);
						if(lis.contains(sum))
						{
							continue;
						}
						else {
						lis.add(sum);
						}
					}
				}
				
			}
		}
		return lis;
	}
	

}
