package Learn;


import MyMath.BasicMath;   //Custom Package Defined 
import java.lang.reflect.Array;
import java.util.Scanner;

public class AddTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int []arr1=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
			arr1[i]=sc.nextInt();
		}
		BasicMath b=new BasicMath();        // Create new Basic math Object
		float sumOfOneArr=b.Add(arr);
		System.out.println(sumOfOneArr);
		AddTwoArrays a=new AddTwoArrays();  // Create the new Object of the Class
		a.sumArray(arr,arr1,n);             // Passing the values as parameters into the Object

	}

	public void sumArray(int arr[], int arr1[],int len)
	{
		int sum[]=new int[len];
		for(int i=0;i<len;++i)
		{
			sum[i]=arr[i]+arr1[i];
			System.out.println(sum[i]);
		}
	}

}
