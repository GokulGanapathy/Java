package guviPractice;

import java.util.Scanner;

public class SumofStrings {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[][]=new String[n][2];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<2;++j)
            {
                arr[i][j]=sc.next();
            }
        }
        int temp=0;
        for(int i=0;i<n;++i)
        {
            for(int j=i+1;j<n;++j)
            {
                if(arr[i][0].equals(arr[j][1]) && arr[i][1].equals(arr[j][0]))
                {
                    System.out.println("YES");
                    temp=1;
                    break;
                }
            }
            if(temp==1)
            {
                break;
            }
        }
        if(temp==0)
        {
             System.out.println("NO");
        }
	}

}
