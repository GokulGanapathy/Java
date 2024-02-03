package guviPractice;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i)
        {
        	arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                if(arr[i]+arr[j]==x)
                {
                    System.out.println("yes");
                    sum=1;
                    break;
                }
            }
            if(sum==1)
            {
                break;
            }
        }
        if(sum==0)
        {
            System.out.println("no");
        }
        sc.close();
	}

}
