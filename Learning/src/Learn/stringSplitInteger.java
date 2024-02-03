package Learn;

import java.util.Scanner;

public class stringSplitInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
        int sum=0;
        for(int i=0;i<str.length();++i)
        {
        	char ch=str.charAt(i);
        	if(ch>=0 && ch<=9)
            {
                sum=sum+(int)(ch);
            }
            else
            {
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(sum);
		/*while(str.charAt(j)!='\n')
		{
			count++;
			j++;
		}
		System.out.print(count);*/
		
		/*String arr[]=str.split(" ");
		int max=0;
		for(String s:arr)
		{
			if(s.contains("."))
			{
				s=s.substring(0, s.length()-1);
			}
			int i;
			try {
			   i = Integer.parseInt(s);
			}
			catch (NumberFormatException e) {
				i=-1;
			}
			if(i>=0 && i>max)
			{
				max=i;
			}
		}
		System.out.println(max);*/

	}


}
