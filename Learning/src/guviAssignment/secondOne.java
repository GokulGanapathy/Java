package guviAssignment;

public class secondOne {

	public static void main(String[] args) {
		
		/*String s="Java is a Programming lanuage";
		String[] arr=s.split(" ");
		for(int i=(arr.length)-1;i>=0;--i) {
			System.out.println(arr[i]);
		}*/
		
		// 1,1,2,3,5,8,13
		
		int a=0;
		int b=1;
		int x=a+b;
		int count=0;
		//System.out.println(a);
		System.out.println(b);
		while(count<6)
		{
			System.out.println(x);
			a=b;
			b=x;
			x=a+b;
			count++;
		}
	}
}
