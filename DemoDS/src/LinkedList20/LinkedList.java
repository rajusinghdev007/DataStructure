package LinkedList20;

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
	
	private void cuttHalf(Node head) {
		
		 if (head == null || head.nextLink == null) {
			 System.out.println("LinkedList is Empty:");
		        return;
		    }
		 
		int count=0;
		Node current=head;
		while(current!=null)
		{
			count++;
			current=current.nextLink;
		}
		int half=count/2;
	    current=head;
	    for (int i = 1; i < half; i++) {
	        current = current.nextLink;
	    }
	    current.nextLink=null;
	}
	
	 private void display() 
	 {
		Node current=head;
		while(current!=null)
		{
			int data=current.data;
			System.out.println(data);
			current=current.nextLink;
		}
		System.out.println();
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the length of LinkedList:");
		int len=sc.nextInt();		
		int[] arr=new int[len];
		LinkedList list=new LinkedList();
		System.out.println("Enter element of LinkedList:");
		for(int i=0; i<len; i++)
		{
			arr[i]=sc.nextInt();
			list.insert(arr[i]);
		}
		list.cuttHalf(list.head);
		
		// Display the list
		System.out.println("Here is elements is :");
		list.display();
	}
}
