package guviPractice;

import java.util.*;

public class substr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		/*String str2=sc.next();
		if(str1.contains(str2))
		{
			System.out.print("True");
		}*/
		ArrayList<Character> lis=new ArrayList<>();
		for(int i=0;i<str1.length();++i)
		{
			int count=0;
			for(int j=0;j<str1.length();++j)
			{
				if(str1.charAt(i)==str1.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			lis.add(str1.charAt(i));
		}
		
		System.out.println(lis);
	}

}
