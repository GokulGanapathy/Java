package Learn;
import java.util.*;
import java.lang.*;


public class AssignmentString {

	public static void main(String[] args) {
		String str="jamesBond007";
		int num=0,alp=0,an=0;
		for (int i=0;i<str.length();++i)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num++;
			}
			/*if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				num++;
			}*/
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				alp++;
			}
			/*{
				String s=str.toLowerCase();
				if(s.charAt(i)>=97 && s.charAt(i)<=122)
				{
					alp++;
				}
			}*/
		}
		System.out.println("Numbers:"+num);
		System.out.println("Aplhabets:"+alp);
		System.out.println("alphanumerical:"+(num+alp));

	}

}
