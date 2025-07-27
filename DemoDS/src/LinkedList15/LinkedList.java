package LinkedList15;

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
	
	private void deleteFirst() {
		if(head==null)
		{
			System.out.println("LinkedList is Empty:");
		}
		head=head.nextLink;
	}
	
	private void deleteKthElements(int k) 
	{
		if(head==null)
		{
			System.out.println("LinkedList is Empty:");
			return;
		}
		if(k==0)
		{
			System.out.println("Element Deleted From 0 Position:"+head.data);
			head=head.nextLink;
			return;
		}
		
        Node current = head;
        for(int i=0; i<k-1; i++)
        {
        	if(current==null || current.nextLink==null)
        	{
                System.out.println("Index " + k + " is out of bounds.");
                return;
        	}
            current=current.nextLink;
        }
    	if(current.nextLink==null)
    	{
            System.out.println("Index " + k + " is out of bounds.");
            return;
    	}
    	 System.out.println("Deleted element at position " + k + ": " + current.nextLink.data);
    	 current.nextLink=current.nextLink.nextLink;
		
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
		System.out.println("Enter the index Position of the Elements:");
		int n=sc.nextInt();		
		list.deleteKthElements(n);
		
		// Display the list
		System.out.println("After First Elements, LinkedList is :");
		list.display();
	}
}
