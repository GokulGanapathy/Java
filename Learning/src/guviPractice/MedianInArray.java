package guviPractice;

import java.util.*;

public class MedianInArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in the array
        int n = scanner.nextInt();
        char ch = scanner.next().charAt(0);
        // Input: Array of numbers
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input: Target median
        int k = scanner.nextInt();

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Find the current median of the array
        int median;
        if (n % 2 == 0) {
            // For an even number of elements, take the average of the middle two elements
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2;
        } else {
            // For an odd number of elements, take the middle element
            median = arr[n / 2];
        }

        // Check if the current median is equal to k
        if (median == k) {
            System.out.println(0); // No adjustment required
        } else {
            // Adjust the median to be equal to k
            if (median < k) {
                median += (k - median);
            } else {
                median -= (median - k);
            }

            // Calculate the absolute difference between the adjusted median and k
            int difference = Math.abs(median - k);

            // Output: Print the count required to make the median equal to k
            System.out.println(difference);
        }

        scanner.close();
		

	}

}
