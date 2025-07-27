package SearchingSorting;

import java.util.Scanner;

public class QuickSort {

	private void quickSort(int[] arr) {
		quickSortRecrusion(arr, 0, arr.length-1);	
	}
	
	private void quickSortRecrusion(int[] arr, int low, int high) {
	if(low<high)
		{
			int pi=partation(arr, low, high);
			quickSortRecrusion(arr, low, pi-1);
			quickSortRecrusion(arr, pi, high);	
		}
	}

	private int partation(int[] arr, int low, int high) {
		int pivote=arr[(low+high)/2];
		while(low<=high)
		{
			while(arr[low]<pivote)
			{
				low++;
			}
			while(arr[high]>pivote)
			{
				high--;
			}
			if(low<=high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		// TODO Auto-generated method stub
		return low;
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

	        QuickSort sorter = new QuickSort();
	        sorter.quickSort(arr);

	        System.out.println("Sorted array is:");
	        sorter.displayArr(arr);
	        sc.close();
	}
}
