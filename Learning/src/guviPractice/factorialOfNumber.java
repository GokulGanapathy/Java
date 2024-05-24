package guviPractice;

public class factorialOfNumber {

	public static void main(String[] args) {
		int n=5;
		long fact=1;
		while(n>0) {
			fact = fact*n;
			n--;
		}
		System.out.println(fact);
	}

}
