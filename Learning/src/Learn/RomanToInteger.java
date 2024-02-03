package Learn;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int X=10;
		int I=1;
		int V=5;
		int L=50;
		int C=100;
		int res=0;
		if(str.contains("X")||str.contains("I")||str.contains("L")||str.contains("C")||str.contains("V"))
		{
			for(int i=str.length()-1;i>=0;--i)
			{
				if(str.charAt(i)=='X')
				{
					res=res+10;
					if(str.charAt(i-1)=='I')
					{
						res=res-1;
						--i;
					}
				}else if(str.charAt(i)=='I')
				{
					res=res+1;
				}
				else if(str.charAt(i)=='V')
				{
					res=res+5;
					if(str.charAt(i-1)=='I')
					{
						res=res-1;
						--i;
					}
				}			}
			
		}
		else
		{
			System.out.println("-1");
		}

	}

}
