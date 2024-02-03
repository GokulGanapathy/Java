package guviPractice;
import java.util.*;

public class stringCamelCaseOp {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        if(op==1)
        {
            int len=str.length();
            System.out.println(len);
        }
        else if(op==3)
        {
            String strcurrent=sc.nextLine();
            String strnext=sc.nextLine();
            String str1=str.replace(strcurrent,strnext);
            System.out.println(str1);
        }
        else if(op==2)
        {
        	System.out.println(str.length());
            System.out.print((char)(str.charAt(0)-32));
            for(int i=1;i<str.length()-1;++i)
            {
                char ch=str.charAt(i);
                if(ch=='i' && str.charAt(i-1)==' ' && str.charAt(i+1)==' ')
                {
                    System.out.print((char)(ch-32));
                }
                else if(ch=='.' && str.charAt(i+1)==' ')
                {
                    System.out.print(". ");
                    System.out.print((char)(str.charAt(i+2)-32));
                    i=i+2;
                }
                else if(ch=='j' && str.charAt(i+1)=='o' && str.charAt(i+2)=='h')
                {
                    System.out.print("J");
                }
                /*else if(ch=='.' && str.charAt(i+1)=='\n')
                {
                    System.out.print(".");
                }*/
                else
                {
                    System.out.print(ch);
                }
            }
            System.out.print(".");
        }
    }

}
