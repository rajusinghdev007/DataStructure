package LinkedList7;

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

	private boolean compare35(Node head) {
		Node current=head;
		int ele3 = 0, ele5=0;
		int count=1;
		while(current!=null)
		{
			if(count==3)
			{
				ele3=current.data;
			}
			
			if(count==5)
			{
				ele5=current.data;
			}
			count+=1;
			current=current.nextLink;
		}
		if(ele3==ele5)
		{
			return true;
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
		System.out.println("");
		boolean bool=list.compare35(list.head);
		System.out.println("3rd Elements and 5th elements are equal:"+bool);
	}
}
