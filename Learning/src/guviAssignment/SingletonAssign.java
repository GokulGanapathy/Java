package guviAssignment;

import java.util.Scanner;

public class SingletonAssign {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		SingleTonString singleton = SingleTonString.getInstance();
		singleton.setValue(str);
		System.out.println(singleton.getValue());
		
		String str2=sc.nextLine();
		SingleTonString singleton2 = SingleTonString.getInstance();
		singleton2.setValue(str2);
		System.out.println(singleton2.getValue());
	}

}
