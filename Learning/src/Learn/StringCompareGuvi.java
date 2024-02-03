package Learn;
import java.util.*;
import java.lang.*;

public class StringCompareGuvi {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int len1=str1.length();
		int len2=str2.length();
		int n;
		if(len1>=len2)
		{
			n=len1;
		}
		else
		{
			n=len2;
		}
		int value=1;
		for(int i=0;i<n;++i)
		{
			if((str1.charAt(i))==str2.charAt(i))
			{
				value=1;
			}
			else
			{
				value=0;
				break;
			}
		}
		if(value==1)
		{
			System.out.println("The two String is same");
		}
		else
		{
			System.out.println("The two String is Diff");
		}
		/*if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("The two String is same");
		}
		else
		{
			System.out.println("The two String are different");
		}*/
	}

}
