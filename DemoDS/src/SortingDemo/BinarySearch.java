package SortingDemo;
import java.util.Scanner;

public class BinarySearch {

	private boolean binarySearch(int[] arr, int target) {
		int left=0; 
		int right=arr.length-1;
		
		while(left<=right)
		{
			int mid=left+((right-left)/2);
			if(target>arr[mid])
			{
				left=mid-1;
			}
			else if(target<arr[mid])
			{
				right=mid-1;
			}
			else
			{
				System.out.println("Element Found At Index:"+mid);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);      

	        System.out.println("Enter the length of the array:");
	        int len = sc.nextInt();

	        int[] arr = new int[len];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < len; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Enter the element to search:");
	        int val = sc.nextInt();  

	        BinarySearch sorter = new BinarySearch();
	        boolean bool=sorter.binarySearch(arr, val);
	        System.out.println("Element Found Status:"+bool);
	        sc.close();
	}
}
