package guviPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;++i)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;++j)
			{
				arr[j]=sc.nextInt();
			}
			int x=sc.nextInt();
			Arrays.sort(arr);
			ArrayList<Integer> lis= new ArrayList<>();
			for(int j=0;j<n;++j)
			{
				if(!(lis.contains(arr[j])))
				{
					lis.add(arr[j]);
				}
			}
			System.out.println(lis.get(x-1));
		}

	}

}
