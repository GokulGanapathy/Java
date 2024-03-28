package Learn;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Capital Letter at every nth Character
        /*String str=sc.nextLine();
        int n=sc.nextInt();
        int count=1;
        for(int i=0;i<str.length();++i)
        {
            if(count==n)
            {
                System.out.print((char)((str.charAt(i))-32));
                count=1;
            }
            else
            {
	            count++;
	            System.out.print(str.charAt(i));
            }
            
        }*/
        
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        for(int i=0;i<n;++i)
        {
        	for(int j=0;j<space;++j)
        	{
        		System.out.print(" ");
        	}
        	for(int j=space;j<(2*i)-1;++j)
        	{
        		System.out.print("*");
        	}
        	space--;
        	star++;
        	System.out.println();
        }
    }
}