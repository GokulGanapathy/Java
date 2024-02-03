package Learn;

import java.util.*;

public class RemoveFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		ArrayList<Integer> lis = new ArrayList<>();
		for(int i=0;i<n;++i)
		{
			lis.add(sc.nextInt());
		}
		//lis.replaceAll("");
		for(int i=0;i<lis.size();++i)
		{
			if(lis.get(i)==x)
			{
				lis.remove(i);
				if(i==0)
				{
					i=-1;
				}
			}
			System.out.println("Index is : " +i+":"+lis);
		}
		if(lis.isEmpty())
		{
			System.out.println("empty");
		}
		else
		{
			int size=lis.size();
			for(int i=0;i<size;++i)
			{
				if(i<size-1)
				{
					System.out.println(lis.get(i)+" ");
				}
				else if(i==size-1)
				{
					System.out.println(lis.get(i));
				}
			}
		}
		
	}

}
