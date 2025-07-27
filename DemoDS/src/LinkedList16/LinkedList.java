package LinkedList16;

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
	
	private void add5(Node head) {
		Node current=head;
		while(current!=null)
		{
			int data=current.data;
			if(data%3==0)
			{
				current.data=data+5;
			}
			current=current.nextLink;
		}
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
		list.add5(list.head);
		
		// Display the list
		System.out.println("Here is elements is :");
		list.display();
	}
}
