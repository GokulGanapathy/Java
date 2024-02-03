package Learn;

import java.util.*;

public class ArrayMidElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList <Integer> lis= new ArrayList<>();
		for(int i=0;i<n;++i)
		{
			lis.add(sc.nextInt());
		}
		for(int i=0;i<n;++i)
		{
			//System.out.println(lis);
			int x=lis.size();
			int res = 0;
			if(x%2==0)
			{
				res=lis.get((x/2)-1);
				System.out.print(res+" ");
				lis.remove((x/2)-1);
			}
			else
			{
				res=lis.get(x/2);
				System.out.print(res+" ");
				lis.remove(x/2);
			}
			//System.out.println(lis);
			
			
		}

	}

}
