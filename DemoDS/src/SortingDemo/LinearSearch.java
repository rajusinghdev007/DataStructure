package SortingDemo;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

	private boolean linearSearch(ArrayList<String> arrList, String target) {
		boolean status=false;
		System.out.println("");
		for(int i=0; i<arrList.size(); i++)
		{
			String str=arrList.get(i);
			if(target.equals(str))
			{
				System.out.println("Element Found At index:"+i);
				status=true;
				break;
			}
		}
		if(!status)
		{
			System.out.println("element is not found!:");
		}
		return status;
	}

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);      

	        System.out.println("Enter the length of the array:");
	        int len = sc.nextInt();
	        String[] str=new String[len];
	        ArrayList<String> arrList=new ArrayList<String>();
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < len; i++) {
	            str[i] = sc.next();
	            arrList.add(str[i]);
	        }

	        System.out.println("Enter the element to search:");
	        String target = sc.next();  

	        LinearSearch sorter = new LinearSearch();
	        boolean bool=sorter.linearSearch(arrList, target);
	        System.out.println("Element Found Status:"+bool);
	        sc.close();
	}
}
