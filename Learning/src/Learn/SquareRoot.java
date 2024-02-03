package Learn;
import java.util.*;
import MyMath.BasicMath;

public class SquareRoot {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BasicMath b=new BasicMath();
		double sqrt=b.sqrt(n);
		System.out.println(sqrt);
	}

}
