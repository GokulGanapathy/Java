package Learn;
import java.util.*;
public class IncreasingSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int maxsum=0;
		for(int i=0;i<n-1;++i)
		{
			sum=arr[i];
			int prev=arr[i];
			for(int j=i+1;j<n;++j)
			{
				if(arr[j]>prev)
				{
					sum=sum+arr[j];
				}
				else
				{
					break;
				}
				prev=arr[j];
			}
			if(sum>=maxsum)
			{
				maxsum=sum;
			}
		}
		System.out.println(maxsum);

	}

}
