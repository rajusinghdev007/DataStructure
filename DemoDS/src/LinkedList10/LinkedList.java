package LinkedList10;

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
	
	private int thirdLast(Node head) 
	{
		Node leadPointer=head;
		Node folowPointer=head;
		int k=3;
		for(int i=0; i<k; i++)
		{
			if(leadPointer==null)
			{
				throw new IllegalArgumentException("The list has fewer than " + k + " elements.");
			}
			leadPointer=leadPointer.nextLink;
		}
		
		while(leadPointer!=null)
		{
			leadPointer=leadPointer.nextLink;
			folowPointer=folowPointer.nextLink;
		}
		return folowPointer.data;
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
		int ele=list.thirdLast(list.head);
		System.out.println("");
		System.out.println("Find Third Last Element:"+ele);
	}
}
