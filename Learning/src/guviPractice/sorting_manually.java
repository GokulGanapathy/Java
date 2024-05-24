package guviPractice;

import java.util.Arrays;
import java.util.Collections;

public class sorting_manually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {4,3,5,7,1,2,6,10,9,8};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;++j) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//Conventional way
		for(int i=0;i<n-1;++i) {
			for(int j=0;j<n-i-1;++j) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<n;++i) {
			System.out.print(arr[i]+" ");
		}
	}

}
