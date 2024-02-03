package guviPractice;
import java.util.*;
public class arrayAddRev {
	
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n1=sc.nextInt();
	        int arr1[]=new int[n1];
	        for(int i=0;i<n1;++i)
	        {
	            arr1[i]=sc.nextInt();
	        }
	        int n2=sc.nextInt();
	        int arr2[]=new int[n2];
	        for(int i=0;i<n2;++i)
	        {
	            arr2[i]=sc.nextInt();
	        }
	        if(arr2[0]<arr1[n1-1] && n2==1)
        	{
        		System.out.print(n1+1);
        	}
	        else
	        {
		        ArrayList <Integer> arr=new ArrayList<>();
		        for(int i=0;i<n2;++i)
		        {
		        	for(int j=0;j<n1-1;++j)
		        	{
		        		if(arr2[i]>arr1[j+1] && arr2[i]<arr1[j])
		        		{
		        			arr.add(j+2);
		        			break;
		        		}
		        	}
		      
		        }
		        
		        for(int i=0;i<arr.size()-1;++i)
		        {
		        	System.out.print(arr.get(i)+" ");
		        }
		        System.out.print(arr.get(arr.size()-1));
		        /*Iterator<Integer> itr=arr.iterator();
		        while(itr.hasNext())
		        {
		        	System.out.println(itr.next());
		        }*/
	        }
	}

}
