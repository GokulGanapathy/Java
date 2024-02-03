package Learn;
import java.util.*;

public class CustomSubString {
	
	public static String subString(String s,int a,int b)
	{
		StringBuffer sb=new StringBuffer("");
		if(b<=s.length() && a>0)
		{
			for(int i=a-1;i<b;++i)
			{
				sb.append(s.charAt(i));
			}

			String str1=sb.toString();
			return str1;
		}
		else
		{
			System.out.println("Error : Enter the Valid Start and end index");
			return null;
		}
	}
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Staring Index");
		int a=sc.nextInt();
		System.out.println("Ending Index");
		int b=sc.nextInt();
		String substr=subString(str,a,b);
		if(substr!=null)
		{
		System.out.println("The Substring is : "+substr);
		}
	}

}
