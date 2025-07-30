package LinkedList13;

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
	
	private void firstInsert(int data) {
        Node newNode = new Node(data);
        newNode.nextLink = head;
        head = newNode;
	}
	
	private void anyPointInsert(int index, int data) {
		if(index<0)
		{
            System.out.println("Invalid index.");
            return;
		}
		if(index==0)
		{
			firstInsert(data);
			return;
		}
		Node newNode=new Node(data);
		Node current=head;
		for(int i=0; i<index-1; i++)
		{
			if(current==null)
			{
	             System.out.println("Index " + index + " is out of bounds.");
	                return;
			}
			current=current.nextLink;
		}
		if(current==null)
		{
             System.out.println("Index " + index + " is out of bounds.");
                return;
		}
		newNode.nextLink=current.nextLink;
		current.nextLink = newNode;
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
		System.out.println("Enter the Index Point of LinkedList:");
		int idx=sc.nextInt();	
		System.out.println("Enter the Element of Index:");
		int n=sc.nextInt();	
		list.anyPointInsert(idx, n);
		list.display();
	}
}
