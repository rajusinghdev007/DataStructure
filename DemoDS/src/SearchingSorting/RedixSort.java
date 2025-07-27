package SearchingSorting;

import java.util.Scanner;

public class RedixSort {
	private void redixSort(int[] arr) {
		
	}
	
	
	private void displayArr(int[] arr) {
		for(int ele: arr)
		{
			System.out.println(ele+"");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the length of the array:");
	        int len = sc.nextInt();

	        int[] arr = new int[len];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < len; i++) {
	            arr[i] = sc.nextInt();
	        }

	        RedixSort sorter = new RedixSort();
	        sorter.redixSort(arr);

	        System.out.println("Sorted array is:");
	        sorter.displayArr(arr);
	        sc.close();
	}
}
