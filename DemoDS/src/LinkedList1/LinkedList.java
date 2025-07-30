package LinkedList1;

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
	
	private void insertAtStart(int n) 
	{
		Node newNode=new Node(n);
		newNode.data=n;
		newNode.nextLink=null;
		newNode.nextLink=head;
		head=newNode;
		
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
		System.out.println("Enter the element to insertAtStart LinkedList:");
		int n=sc.nextInt();			
		int[] arr=new int[len];
		LinkedList list=new LinkedList();
		System.out.println("Enter element of LinkedList:");
		for(int i=0; i<len; i++)
		{
			arr[i]=sc.nextInt();
			list.insert(arr[i]);
		}
		System.out.println("Elements of LinkedList :");
		list.insertAtStart(n);
		
		// Display the list
		System.out.println("Here is elements is :");
		list.display();
	}
}
