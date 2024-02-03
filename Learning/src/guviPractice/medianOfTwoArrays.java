package guviPractice;

import java.util.*;


public class medianOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int nums1[]=new int[x];
		int nums2[]=new int[y];
		for(int i=0;i<x;++i)
		{
			nums1[i]=sc.nextInt();
		}
		for(int i=0;i<y;++i)
		{
			nums2[i]=sc.nextInt();
		}
		double res=0;
        ArrayList<Integer> lis = new ArrayList<Integer>();
        //Collections.addAll(lis, nums1);
        for(int i=0;i<nums1.length;++i)
        {
            lis.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;++i)
        {
            lis.add(nums2[i]);
        }
        System.out.println(lis);
        Collections.sort(lis);
        System.out.println(lis);
        if(lis.size()==2)
        {
            res= (double)((lis.get(0)+lis.get(1))/2.0);
        }
        else if(lis.size()==3)
        {
            res= (double)(lis.get(1));
        }
        else if(lis.size()>3)
        {
            int len=(lis.size()/2);
            res= (double)((float)(lis.get(len-1)+lis.get(len))/2);
        }
        System.out.println(res);

	}

}
