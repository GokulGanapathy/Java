package Learn;

import java.util.*;

public class mapStringCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<n;++i)
		{
			System.out.println(arr[i]);
		}
		HashMap<String,Integer> map=new HashMap<>();
		Map<String,Integer> syncMap=Collections.synchronizedMap(map);
		for(int i=0;i<n;++i)
		{
			map.put(arr[i], i+1);
		}
		System.out.println(map);
		System.out.println(syncMap);
		
	}

}
