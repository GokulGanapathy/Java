package Learn;
import java.util.*;
import java.util.StringTokenizer;

public class strings {
	public static void main(String args[])
	{
		String s="Faf,Kohli,Maxi,DK";
		StringTokenizer str=new StringTokenizer(s,",");   // Tokenizer using the build-in Function of StringTokenizer
		while(str.hasMoreElements())
		{
			System.out.println(str.nextElement());
		}
		int count=0;
		for(char ch :s.toCharArray()){
			count++;
		}
		System.out.println("The length of the String is : "+count);
		//String Tokenize using Split Function
		/*String [] str=s.split(" ");
		for(String str1:str)
		{
			System.out.println(str1);
		}*/
		
		StringBuffer sb=new StringBuffer("Gokul");
		sb.append("Anand");
		System.out.println(sb);
		
		StringBuilder sbu=new StringBuilder("Indian");
		sbu.deleteCharAt(5);
		int a=sbu.capacity();
		System.out.println("Capacity that can be Stored is : "+a);
		System.out.println(sbu);
		
	}

}
