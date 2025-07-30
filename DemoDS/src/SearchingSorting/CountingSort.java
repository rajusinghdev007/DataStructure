package SearchingSorting;

import java.util.Scanner;

public class CountingSort {
	private void countingSort(int[] arr) {
		int length=arr.length;
		if(length==0)
		{
			System.out.println("Array is Empty!");
			return;
		}
		//create output array
		int[] output=new int[length];
		
		int max=findMax(arr);
		if(max<0)
		{
			System.out.println("Negetive Numbers is not allowed in this sorting!");
			return;
		}
		int[] count=new int[max+1];
		
        // Create count array
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
			{
				System.out.println("Negetive Numbers is not allowed!");
			}
			count[arr[i]]++;
		}
		
		//prefix sum of the count array
		for(int i=1; i<count.length; i++)
		{
			count[i]+=count[i-1];
		}
		
		//putting right place to the elements
		for(int i=length-1; i>=0; i--)
		{
			int idx=count[arr[i]]-1;
			output[idx]=arr[i];
			count[arr[i]]--;
		}
		
		//coppying the elements from output array
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=output[i];
		}
	}

	private int findMax(int[] arr) {
		int mx=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>mx)
			{
				mx=arr[i];
			}
		}
		return mx;
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

	        CountingSort sorter = new CountingSort();
	        sorter.countingSort(arr);

	        System.out.println("Sorted array is:");
	        sorter.displayArr(arr);
	        sc.close();
	}
}
