package guviAssignment;

import java.util.Scanner;

public class longestsubStringWithOutRepeatingCharcters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		int max=0;
		for(int i=0;i<str.length();++i)
		{
			s="";
			
			for(int j=i;j<str.length();++j)
			{
				if(s.contains(Character.toString(str.charAt(j))))
				{
					break;
				}
				else
				{
					s=s+(Character.toString(str.charAt(j)));
				}
			}
			int len=s.length();
			if(len>=max)
			{
				max=len;
			}
		}
		System.out.println(max);

	}

}
