package LinkedList21;
import java.util.Scanner;

public class LinkedList {
	Node head;	
	private void insert(int data) {
		 Node node = new Node(data);
	        if (head == null) {
	            head = node;
	        } else {
	            Node current = head;
	            while (current.nextLink != null) {
	                current = current.nextLink;
	            }
	            current.nextLink = node;
	        }
	}	
	
	//combined element print 
	private boolean isSame(Node head2, Node head3) {
	Node current1 = head2;
	Node current2 = head3;
	int index = 0;

	while (current1 != null && current2 != null) {
	if (current1.data != current2.data) {
		 System.out.println("Elements of LinkedList are not matched at index: " + index);
		 return false;
	 }
		current1 = current1.nextLink;
		current2 = current2.nextLink;
		index++;
	}
	
	if (current1 != null || current2 != null) {
        System.out.println("Size of LinkedLists is not the same");
        return false;
    }

    System.out.println("Elements of both LinkedLists match exactly.");
    return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the length of LinkedList 1:");
		int len1=sc.nextInt();		
		int[] arr1=new int[len1];
		LinkedList list1=new LinkedList();
		System.out.println("Enter element of LinkedList 1:");
		for(int i=0; i<len1; i++)
		{
			arr1[i]=sc.nextInt();
			list1.insert(arr1[i]);
		}
		System.out.println("");
		System.out.println("Enter the length of LinkedList 2:");
		int len2=sc.nextInt();		
		int[] arr2=new int[len2];
		LinkedList list2=new LinkedList();
		System.out.println("Enter element of LinkedList 2:");
		for(int i=0; i<len2; i++)
		{
			arr2[i]=sc.nextInt();
			list2.insert(arr2[i]);
		}	
		System.out.println("");
		LinkedList combinedList = new LinkedList();
		
		
		// Display the list
		boolean bool=combinedList.isSame(list1.head, list2.head);
		System.out.println("is Bothe LinkedList Elements Are Same Status:"+bool);
	}
}
