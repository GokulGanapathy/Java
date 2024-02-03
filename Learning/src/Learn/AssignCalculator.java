package Learn;
import java.util.*;


public class AssignCalculator {
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void sub(int a,int b)
	{
		if(a>=b)
		{
			int diff=a-b;
			System.out.println(diff);
		}
		else
		{
			int diff=b-a;
			System.out.println(diff);
		}
	}
	public void mult(int a,int b)
	{
		int res=a*b;
		System.out.println(res);
	}
	public void div(int a,int b)
	{
		int res=a/b;
		System.out.println(res);
	}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	AssignCalculator c=new AssignCalculator();
	c.add(a, b);
	c.sub(a, b);
	c.mult(a, b);
	c.div(a, b);
}
}



