package Learn;
import java.util.*;

public class Saturated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();					
        int a=n%10;							
        int x=n/10,y;
        int b = 0;
        while(x>0)							
        {
            y=x%10;							
            if(y!=a)						
            {
                b=y;
                System.out.print(b);
                break;
            }
            else
            {
                x=x/10;
            }
        }
        int Track=0;
        while(n>0)
        {
            int digit=n%10;
            if(digit==a||digit==b)
            {
                Track=1;
            }
            else
            {
                Track=0;
                break;
            }
            n=n/10;
        }
        if(Track==1)
        {
            System.out.println("Saturated");
        }
        else 
        {
            System.out.println("Unsaturated");
        }

	}

}
