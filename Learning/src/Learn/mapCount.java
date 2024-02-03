package Learn;

import java.util.*;

public class mapCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;++i)
		{
			int count=1;
			if(map.containsKey(arr[i]))
			{
				map.replace(arr[i], map.get(arr[i]), (map.get(arr[i]))+1);
			}
			else
			{
				map.put(arr[i], count);
			}
		}
		System.out.println(map);
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println("The count of "+key+" in the array is : "+map.get(key));
		}
	}

}
