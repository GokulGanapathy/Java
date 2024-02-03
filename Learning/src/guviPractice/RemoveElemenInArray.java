package guviPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElemenInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;++i)
		{
			nums[i]=sc.nextInt();
		}
		int val=sc.nextInt();
		mySolution(nums,val);      //Taken 1ms
		enhancedSolution(nums, val); // Taken 0ms
	}
	
	public static void enhancedSolution(int nums[],int val) {
		int index=0;
		for(int i=0;i<nums.length;++i)
		{
			if(nums[i]!=val)
			{
				nums[index]=nums[i];
				index++;
			}
			else
			{
				continue;
			}
		}
		System.out.println(index);
		for(int i=0;i<index;++i)
		{
			System.out.print(nums[i]+" ");
		}
	}
	public static void mySolution(int nums[],int val)
	{
		ArrayList<Integer> lis = new ArrayList<>();
        for(int i=0;i<nums.length;++i)
        {
            lis.add(nums[i]);
        }
        while(lis.contains(val)){
        for(int i=0;i<lis.size();++i)
        {
            if(lis.get(i)==val)
            {
                lis.remove(i);
            }
        }}
        //lis.removeAll(val);
        for(int i=0;i<lis.size();++i)
        {
            nums[i]=lis.get(i);
        }
        System.out.println(lis.size());
        System.out.println(lis);
	}

}
