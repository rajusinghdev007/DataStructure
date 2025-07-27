package SearchingSorting;

import java.util.Scanner;

public class InsertionSort {

	private void insertionSort(int[] arr) {
		int j, temp, key;
		for(int i=1; i<arr.length; i++)
		{
			j=i;
			key=arr[i];
			while(j>0 && arr[j-1]>key)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=key;
		}
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

	        InsertionSort sorter = new InsertionSort();
	        sorter.insertionSort(arr);

	        System.out.println("Sorted array is:");
	        sorter.displayArr(arr);
	        sc.close();
	}
}
