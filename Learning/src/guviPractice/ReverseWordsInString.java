package guviPractice;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;++i)
		{
			StringBuffer sb=new StringBuffer(str1[i]);
			sb.reverse();
			String res=sb.toString();
			System.out.println(res);
		}
	}

}
