package Learn;

import java.util.*;

public class StringConstructor {
	
	private char[] name;

	public StringConstructor(String name)
	{
		this.name=name.toCharArray();
		System.out.println(this.name[2]);
		for(int i=0;i<name.length();++i)
		{
			char ch=name.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		StringConstructor strcons=new StringConstructor(str);
	}

}
