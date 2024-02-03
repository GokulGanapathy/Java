package guviPractice;
import java.util.*;

public class replaceInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		int x=len/2;
		if(len==1)
		{
			str=str.replace(str.charAt(0), '*');
			System.out.print(str);
		}
		else if(len>1)
		{
			if(len%2==0)
			{
				System.out.println(str);
				str=str.replace(str.charAt(x), '*');
				System.out.println(str);
				str=str.replace(str.charAt(x-1), '*');
				System.out.println(str);
			}
			else if(len%2!=0)
			{
				System.out.println(str);
				str=str.replace(str.charAt(x), '*');
				System.out.println(str);
			}
		}

	}

}
