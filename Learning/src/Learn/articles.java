package Learn;
import java.util.*;
public class articles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s=str.toLowerCase();
		String arr[]=s.split(" ");
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;++i)
		{
			System.out.println(arr[i]);
			if(arr[i].equals("the")||arr[i].equals("a")||arr[i].equals("an"))
			{
				System.out.print(arr[i+1]);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("-1");
		}
	}

}
