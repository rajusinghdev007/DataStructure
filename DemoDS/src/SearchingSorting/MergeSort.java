package SearchingSorting;

import java.util.Scanner;

public class MergeSort {
	private int length;
	private int[] array;
	private int[] tempArray;
	
	private void mergeSort(int[] arr)
	{
		this.length=arr.length;
		this.array=arr;
		this.tempArray=new int[length];
		
		divideArray(0, length-1);
	}

	private void divideArray(int lowIndex, int highIndex) 
	{
		if(lowIndex<highIndex)
		{
			int mid=lowIndex+(highIndex-lowIndex)/2;
			
			divideArray(lowIndex, mid);
			divideArray(mid+1, highIndex);
			tempMergeArray(lowIndex, mid, highIndex);
		}
	}

	private void tempMergeArray(int lowIndex, int mid, int highIndex) 
	{
		for(int i=lowIndex; i<=highIndex; i++)
		{
			tempArray[i]=array[i];
		}
		int i=lowIndex;
		int j=mid+1;
		int k=lowIndex;
		while(i<=mid && j<=highIndex)
		{
			if(tempArray[i]<=tempArray[j])
			{
				array[k]=tempArray[i];
				i++;
			}
			else
			{
				array[k]=tempArray[j];
				j++;				
			}
			k++;
		}
		while(i<=mid)
		{
			array[k]=tempArray[i];
			i++;
			k++;
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

	        MergeSort sorter = new MergeSort();
	        sorter.mergeSort(arr);

	        System.out.println("Sorted array is:");
	        sorter.displayArr(arr);
	        sc.close();
	}
}
