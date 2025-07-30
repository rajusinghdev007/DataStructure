package SortingDemo;
import java.util.Scanner;

public class LinearSearch1 {

	private boolean linearSearch(int[] arr, int target) {
		boolean status=false;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				System.out.println("Element Found At Index:"+i);
				status=true; 
			}
		}
		if(!status)
		{
			System.out.println("Element is Not Found!");
		}
		return status;
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

	        LinearSearch1 sorter = new LinearSearch1();
	        boolean bool=sorter.linearSearch(arr, val);
	        System.out.println("Element Found Status:"+bool);
	        sc.close();
	}
}
