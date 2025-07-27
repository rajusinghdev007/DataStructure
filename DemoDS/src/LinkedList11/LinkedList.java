package LinkedList11;

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
	

	private void modifyList(Node head) {
		Node current=head;
		while(current!=null)
		{
			int data=current.data;
			if(data%2==0)
			{
				current.data=data*10;
			}
			current=current.nextLink;
		}
		display();
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
		list.modifyList(list.head);
	}
}
