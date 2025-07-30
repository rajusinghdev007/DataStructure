package SearchingSorting;

import java.util.Scanner;

public class RedixSort {
	private void redixSort(int[] arr) {
		
		int length=arr.length;
		int max=findMax(arr);
		for(int place=1; max/place>0; place*=10)
		{
			countSort(arr, place);
		}
	}
	
	 private void countSort(int[] arr, int place) 
	 {
		int len=arr.length;
		int[] output=new int[len];
		int[] count=new int[10];
		
		for(int i=0; i<len; i++)
		{
			int digit=(arr[i]/place)%10;
			count[digit]++;
		}
		
        // Cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        // Build output array (stable sort)
        for (int i = len - 1; i >= 0; i--) {
        	int digit=(arr[i]/place)%10;
        	output[count[digit]-1]=arr[i];
        	count[digit]--;
        }
        
        // Copy output back to original array
        for (int i = 0; i < len; i++) {
            arr[i] = output[i];
        }
		
	}

	// Find the largest element in the array
	private int findMax(int[] arr) {
        if (arr.length == 0) return 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
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
