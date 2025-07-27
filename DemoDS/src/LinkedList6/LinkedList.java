package LinkedList6;

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
	
	private boolean findNode(Node head, int index, int n) {
		int count=1;
		Node current=head;
		boolean bool=false;
		while(current!=null)
		{
			if(count==index)
			{
				int data=current.data;
				if(data==n)
				{
					return true;
				}
			}
			count+=1;
			current=current.nextLink;
		}
		return false;
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

		System.out.println("Enter the Index of LinkedList:");
		int index=sc.nextInt();	
		
		System.out.println("Enter the Search of LinkedList:");
		int n=sc.nextInt();
		
		System.out.println("");
		boolean bool=list.findNode(list.head, index, n);
		System.out.println("Search element is Present:"+bool);
	}
}
