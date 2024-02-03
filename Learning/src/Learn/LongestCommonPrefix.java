package Learn;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.next();
		}
		String res="";
		for(int i=0;i<arr[0].length();++i)
		{
			if(arr[0].charAt(i)==arr[1].charAt(i))
			{
				res=res+(Character.toString(arr[0].charAt(i)));
			}
			else
			{
				break;
			}
		}
		System.out.println(res);

	}

}
