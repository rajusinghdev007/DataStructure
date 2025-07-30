package SearchingSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort{
	
	private void bucketSort(float[] arr) {
		int len=arr.length;
		ArrayList<Float>[] buckets = new ArrayList[len];
		for (int i = 0; i < len; i++) {
		    buckets[i] = new ArrayList<Float>();
		}
		
		for(int i=0; i<len; i++)
		{
			 int bucketIndex = (int) (arr[i] * len); // multiply by size
	         if (bucketIndex >= len) 
	         bucketIndex = len - 1; // prevent overflow
			buckets[bucketIndex].add(arr[i]);
		}
		
		for(int i=0; i<len; i++)
		{
			Collections.sort(buckets[i]);
		}
		
		 // Concatenate all buckets into arr[]
		int index=0;
		for (int i = 0; i < len; i++) {
			for(float value:buckets[i])
			{
				arr[index++]=value;
			}
		}
		
	}
	
	private void displayArr(float[] arr) {
		for(float ele: arr)
		{
			System.out.println(ele+"");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the length of the array:");
	        int len = sc.nextInt();

	        float[] arr = new float[len];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < len; i++) {
	            arr[i] = sc.nextFloat();
	        }

	        BucketSort sorter = new BucketSort();
	        sorter.bucketSort(arr);

	        System.out.println("Sorted array is:");
	        sorter.displayArr(arr);
	        sc.close();
	}
}
