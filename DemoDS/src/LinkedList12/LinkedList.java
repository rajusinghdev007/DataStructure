package LinkedList12;

import java.util.Scanner;

public class LinkedList 
{
	Node head;	
	private void insert(int data) 
	{
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
	

	private void firstInsert(int n) {
		Node node=new Node(n);
		node.nextLink=head;
		head=node;
	}
	
	private void display() {
		System.out.println("Modified element of LinkedList:");
		Node current=head;
		while(current!=null)
		{
			int data=current.data;
			System.out.println(data+"");
			current=current.nextLink;
		}	
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
		System.out.println("Enter the First Element of LinkedList:");
		int n=sc.nextInt();	
		list.firstInsert(n);
		list.display();
	}
}
