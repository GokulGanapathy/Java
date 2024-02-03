package Learn;
import java.util.*;

public class AvgOfArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for (int i=0;i<arr.length;++i)
		{
			arr[i]=sc.nextInt();
		}
		AvgOfArray a=new AvgOfArray();
		float avg =a.avg(arr);
		System.out.println("The avg of Array is :"+avg);
		/*int sum=0;
		for(int i=0;i<arr.length;++i)
		{
			sum=sum+arr[i];
		}
		float avg=(float)sum/arr.length;
		System.out.println("The avg of Array is :"+avg);*/
				
	}
	public float avg(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;++i)
		{
			sum=sum+arr[i];
		}
		float avg= (float)sum/arr.length;
		return avg;
	}

}
