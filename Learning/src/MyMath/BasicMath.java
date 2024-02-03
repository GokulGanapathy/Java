package MyMath;

public class BasicMath {

	public float Add(int arr[])
	{
		float sum=0;
		for(int i=0;i<arr.length;++i)	
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public float mul(int arr[])
	{
		float mul=1;
		for(int i=0;i<arr.length;++i)
			
		{
			mul=mul*arr[i];
		}
		return mul;
	}
	public double sqrt(int n)
	{
		double t;  
		double sqrtroot=n/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(n/t))/2;  
		}   
		while((t-sqrtroot)!= 0); 
		return sqrtroot;
	}

}
