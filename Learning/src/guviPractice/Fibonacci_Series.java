package guviPractice;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		while(true) {
			int temp=a+b;
			if(temp<=1000) {
				System.out.print(temp+" ");
				a=b;
				b=temp;
			}
			else {
				break;
			}
		}
	}

}
