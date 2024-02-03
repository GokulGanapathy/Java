package guviPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class RohitStandingPos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;++i)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			ArrayList<Integer> lis= new ArrayList<>();
			for(int j=1;j<=n;++j)
			{
				lis.add(j);
			}
			while(lis.size()>=k)
			{
				lis=thirdPos(lis,k);
			}
			System.out.println(lis.get(0));
		}
	}
	
	public static ArrayList<Integer> thirdPos(ArrayList<Integer> lis,int k)
	{
		int x=k-1;
		ArrayList <Integer> lis2 = new ArrayList<>();
		for(int i=0;i<lis.size();++i)
		{
			if(i==x)
			{
				lis2.add(lis.get(i));
				x=x+k;
			}
		}
		return lis2;
	}

}
