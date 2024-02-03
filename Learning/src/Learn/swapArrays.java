package Learn;

import java.util.ArrayList;
import java.util.Scanner;

public class swapArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> arrlis=new ArrayList<>();
		for(int i=0;i<n;)
		{
			if(i<n-1)
			{
				arrlis.add(arr[i+1]);
				System.out.println(" The "+(i+1)+" th element is "+arr[i+1]);
			}
			arrlis.add(arr[i]);
			System.out.println(" The "+i+" th element is "+arr[i]);
			i=i+2;
		}
	}

}
