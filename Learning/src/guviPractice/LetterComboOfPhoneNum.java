package guviPractice;

import java.util.*;

public class LetterComboOfPhoneNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int digit=sc.nextInt();
		
		combo(digit);

	}
	public static List<String> combo(int n)
	{
		List<String> lis = new ArrayList<>();
		if(!(n>=2))
		{
			return lis;
		}
		
		HashMap<Integer,String> map= new HashMap<>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		
		
		return lis;
	}

}
