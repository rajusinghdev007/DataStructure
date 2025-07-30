package SearchingSorting;

import java.util.Scanner;

public class SelectionSort {
	private void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			int min=i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
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

	        SelectionSort sorter = new SelectionSort();
	        sorter.selectionSort(arr);

	        System.out.println("Sorted array is:");
	        sorter.displayArr(arr);
	        sc.close();
	}
}
