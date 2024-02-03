package Learn;

import java.util.Scanner;

public class HighestAndLowestNuminArrayAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;++i)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Number is : "+max);

		System.out.println("Minimum Number is : "+min);

	}

}
