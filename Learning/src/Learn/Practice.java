package Learn;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
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
            
        }
    }
}