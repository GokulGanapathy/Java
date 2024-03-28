package Challanges;

import java.util.Arrays;
import java.util.List;

public class listSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>lis1 = Arrays.asList(11, 60, 29);
		List<Integer>lis2 = Arrays.asList(28, 78, 33);
		int sum=0;
		for(int i=0;i<lis1.size();++i)
		{
			if(lis1.get(i)%2!=0)
			{
				sum=sum+lis1.get(i);
			}
		}
		for(int i=0;i<lis2.size();++i)
		{
			if(lis2.get(i)%2!=0)
			{
				sum=sum+lis2.get(i);
			}
		}
		System.out.println(sum);
	}

}
