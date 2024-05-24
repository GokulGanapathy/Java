package guviPractice;

import java.util.Arrays;

public class ArraysEquality {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6};
		System.out.println(Arrays.mismatch(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr2));

	}

}
