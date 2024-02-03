package guviPractice;
import java.util.*;

public class bankingOperation {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 //System.out.println("Enter the Number of Instances : ");
		 int n=sc.nextInt();
		 sc.nextLine();
		 
		 String arr[][]=new String[n][3];
		 //System.out.println("Enter the actual account values");
		 for(int i=0;i<n;++i)
		 {
			 for(int j=0;j<3;++j)
			 {
				 arr[i][j]=sc.next();
			 }
		 }
		 
		 //System.out.println("Enter the Choice of Operation ");
		 int choice=sc.nextInt();
		 sc.nextLine();
		 
		 if(choice==1) 
		 {
			 String accNum=sc.next();
			 int amt=sc.nextInt();
			 withdraw(arr,accNum,amt);
		 }
		 else if(choice==2)
		 {
			 String accNum=sc.next();
			 int amt=sc.nextInt();
			 deposit(arr,accNum,amt);
		 }
		 else if(choice==3)
		 {
			 String fromAccNum=sc.next();
			 String toAccNum=sc.next();
			 int amt=sc.nextInt();
			 transfer(arr,fromAccNum,toAccNum,amt);
		 }
		 for(int i=0;i<n;++i)
		 {
			 for(int j=0;j<3;++j)
			 {
				 if(j<2)
				 {
					 System.out.print(arr[i][j]+" ");
				 }
				 else if(j==2)
				 {
					 System.out.print(arr[i][j]);
				 }
			 }
			 System.out.println();
		 }
		 
	}
	public static void withdraw(String[][]arr, String account,int amount)
	{
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i][0].equals(account))
			{
				int amt=Integer.parseInt(arr[i][2]);
				int withdrawRes=amt-amount;
				arr[i][2]=Integer.toString(withdrawRes);
			}
		}
	}
	public static void deposit(String[][]arr, String account,int amount)
	{
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i][0].equals(account))
			{
				int amt=Integer.parseInt(arr[i][2]);
				int depositRes=amt+amount;
				arr[i][2]=Integer.toString(depositRes);
			}
		}
	}
	public static void transfer(String[][]arr, String fromAccount,String toAccount,int amount)
	{
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i][0].equals(fromAccount))
			{
				int amt=Integer.parseInt(arr[i][2]);
				int withdrawAmt=amt-amount;
				arr[i][2]=Integer.toString(withdrawAmt);
			}
			else if(arr[i][0].equals(toAccount))
			{
				int amt=Integer.parseInt(arr[i][2]);
				int deposit=amt+amount;
				arr[i][2]=Integer.toString(deposit);
			}
		}
	}

}
