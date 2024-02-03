package Learn;

import java.util.*;

public class PizzaOffer {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a>=b?0:1;
		switch(res)
		{
		case 0:
		int res1=(a==b)?0:1;
		switch(res1)
				{
				
				case 0:	
					System.out.println("Both are Equal");
					break;
				case 1:
					System.out.println(a+" is the largest Number");
					break;
				
				}
		break;
		case 1:
			System.out.println(b+" is the largest Number");
			break;
		}
			
	}

}
