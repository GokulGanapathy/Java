package Intelliflo;

import java.util.Arrays;

public class testRun {
	public static void main(String[] args) {
		String str1 = "my name is gokul";
		String str2 = "is an engineer";
		StringBuilder sb = new StringBuilder(str1);
		sb.append(" ");
		sb.append(str2);
		System.out.println(sb.toString());
		String str =sb.toString();
		String[] strArr = str.split(" ");
		for(int i=0;i<strArr.length;++i) {
			if(strArr[i].equals("gokul")) {
				StringBuilder sb1 = new StringBuilder(strArr[i]);
				sb1.reverse();
				System.out.println(sb1.toString().toUpperCase().trim().replace(" ",""));
			}
		}
	}

}
