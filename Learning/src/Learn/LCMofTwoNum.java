package Learn;
import java.util.*;

public class LCMofTwoNum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm = (a>b) ? a :b;
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)
			{
				System.out.println("The LCM of "+a+" and "+b+" is : "+lcm);
				break;
			}
			lcm++;
		}
	}

}
