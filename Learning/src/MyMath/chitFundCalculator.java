package MyMath;

import java.util.Scanner;

public class chitFundCalculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int month = sc.nextInt();
		int intialAmt = 4750;
		int payingAmt = intialAmt;
		int inc=100;
		int total = 0;
		for(int i=0;i<16;++i)
		{
			
			total=total+payingAmt;
			payingAmt=payingAmt+inc;
		}
		System.out.println("The Total value after 16 Months is : "+total);
		
		int finalAmt = 96000;
		double profit = finalAmt-total;
		double yeild = profit/total;
		double returns=yeild*100;
		System.out.printf("The Yeild percentage is : %.2f\n",returns);
		
		int paidTillMonth=0;
		for(int i=0;i<month;++i)
		{
			paidTillMonth = intialAmt + paidTillMonth;
			intialAmt = intialAmt +inc;
		}
		System.out.println("Amount Paid till "+month+"th Month is : "+paidTillMonth);
		sc.close();

	}

}
