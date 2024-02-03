package guviPractice;

import java.util.*;
import java.util.Scanner;

public class LengthEncodedString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str = sc.next();
        
        //** for the logic below
        /*
         * aaabbbaaabbbccc
		   a6b6c3
         */
        ArrayList<Character> lis = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();++i)
        {
            if(lis.contains(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                lis.add(str.charAt(i));
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<lis.size();++i)
        {
            System.out.print(lis.get(i));
            System.out.print(map.get(lis.get(i)));
        }
        
        //** for the logic below
        /*
         * aaabbbaaabbbccc
		   a3b3a3b3c3
         */
        System.out.println();
        for(int i=0;i<str.length()-1;){
        	char ch=str.charAt(i);
        	int count=0;
        	while(i<str.length() && str.charAt(i)==ch )
        	{
        		count++;
        		i++;
        	}
        	System.out.print(ch);
        	System.out.print(count);
        }

	}

}
