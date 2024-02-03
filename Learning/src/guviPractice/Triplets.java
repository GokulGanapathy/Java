package guviPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		ArrayList<Integer> lis= new ArrayList<>();
		for(int i=0;i<n;++i)
		{
			
			for(int j=0;j<n;++j)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==3)
			{
				if(!(lis.contains(arr[i])))
				{
					lis.add(arr[i]);
				}
				
			}
			count=0;
			
		}
		System.out.println(lis.size());
	}
}
