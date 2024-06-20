package Challanges;

import java.util.ArrayList;
import java.util.Collections;

public class relative_sort_array_1122 {

	public static void main(String[] args) {

		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		int[] res = relativeSort(arr1,arr2);
		for(int i=0;i<res.length;++i) {
			System.out.println(res[i]);
		}
		
	}
	public static int[] relativeSort(int[] arr1,int[] arr2) {
		ArrayList<Integer> lis = new ArrayList<>();
		for(int num:arr1) {
			lis.add(num);
		}
		Collections.sort(lis);
		ArrayList<Integer> lis1 = new ArrayList<>();
		for(int i=0;i<arr2.length;++i) {
			while(lis.contains(arr2[i])) {
				lis1.add(arr2[i]);
				lis.remove(lis.indexOf(arr2[i]));
			}
		}
		for(int i=0;i<lis.size();++i) {
			lis1.add(lis.get(i));
		}
		System.out.println(lis1);
		int res[]=new int[lis1.size()];
		for(int i=0;i<lis1.size();++i) {
			res[i]=lis1.get(i);
		}
		return res;
	}

}
