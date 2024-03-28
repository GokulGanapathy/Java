package Learn;

import java.util.Scanner;

public class Integer_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(binToInt(n));
	}
	
	public static int intToBin(int n)
	{
		/*
		 * For example, to convert the integer 10 to binary:

			10 ÷ 2 = 5 remainder 0   -- 0
			5 ÷ 2 = 2 remainder 1    -- 10
			2 ÷ 2 = 1 remainder 0    -- 010
			1 ÷ 2 = 0 remainder 1    -- 1010
			
			Reading the remainders in reverse order: 1010
		 */
		
		String bin="";     
		while(n>0)
		{
			int rem=n%2;
			bin = Integer.toString(rem)+bin;
			n=n/2;
		}
		return Integer.parseInt(bin);
	}
	
	public static int binToInt(int n)
	{
		/*
		 * For example, to convert the binary number 1010 to an integer:

		   (1 * 2^3) + (0 * 2^2) + (1 * 2^1) + (0 * 2^0) = 8 + 0 + 2 + 0 = 10
		 */
		int power=0;
		int res=0;
		while(n>0)
		{
			res = (int) (res + (n%10)*(Math.pow(2, power)));
			power++;
			n=n/10;
		}
		System.out.println (Integer.toBinaryString(res));
		return res;
	}

}
