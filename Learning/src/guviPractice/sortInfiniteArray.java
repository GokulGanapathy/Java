package guviPractice;

import java.util.*;

public class sortInfiniteArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> lis= new ArrayList<>();
		for(int k=0;k<n;++k)
		{
			ArrayList<Integer> arr=new ArrayList<>();
			while(sc.hasNextInt())
			{
				arr.add(sc.nextInt());
			}
			for(int i=0;i<arr.size();++i)
			{
				lis.add(arr.get(i));
			}
		}
		Collections.sort(lis);
		System.out.println(lis);
	}

}
