package guviPractice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70,80,90};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 75));
		
		int val=40;
		int a=0,b=arr.length-1,temp=1;
		while(a<=b) {
			int mid=(a+b)/2;
			if(arr[mid]==val) {
				System.out.println("Element found at : "+mid);
				temp=0;
				break;
			}
			else if(val>arr[mid]){
				a=mid;
			}
			else if(val<arr[mid]) {
				b=mid;
			}
		}
		if(temp==1) {
			System.out.println("Element not found");
		}
	}

}
