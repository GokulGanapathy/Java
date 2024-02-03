package Learn;

import java.util.*;

public class alternateArraySorting {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*
		 * int arr[]=new int[n]; for(int i=0;i<n;++i) { arr[i]=sc.nextInt(); }
		 */
		ArrayList<Integer> lis1=new ArrayList<>();
		for(int i=0;i<n;++i)
		{
			lis1.add(sc.nextInt());
		}
		ArrayList<Integer> lis2=new ArrayList<>();
		int min=lis1.get(0),max=lis1.get(0);
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				if(lis1.get(j)>max)
				{
					if(!(lis2.contains(lis1.get(j))))
					{
						max=lis1.get(j);
					}
				}
				if(lis1.get(j)<=min)
				{
					if(!(lis2.contains(lis1.get(j))))
					{
						min=lis1.get(j);
					}
				}
			}
			if(!(lis2.contains(max)))
			{
				lis2.add(max);
			}
			if(!(lis2.contains(min)))
			{
				lis2.add(min);
			}
			
		}
		System.out.println(lis2);

	}

}
