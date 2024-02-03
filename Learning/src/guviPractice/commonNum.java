package guviPractice;

import java.util.*;

public class commonNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;++i)
		{
			arr1[i]=sc.nextInt();
		}
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		//arr2.add(arr[0]);
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				if(arr[i]==arr1[j])
				{
					if(!(arr2.contains(arr[i])))
					{
						arr2.add(arr[i]);
					}
				}
			}
		}
		if(arr2.size()!=0)
		{
			for(int i=0;i<arr2.size()-1;++i)
			{
				System.out.println(arr2.get(i)+" ");
			}
			System.out.println(arr2.get(arr2.size()-1));
		}
		else
			System.out.println("-1");
	}

}
