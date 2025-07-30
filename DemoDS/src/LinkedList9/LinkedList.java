package LinkedList9;

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

	private int halfSum(Node head2) {
		int count=0;
		Node current=head2;
		while(current!=null)
		{
			count++;
			current=current.nextLink;
		}
		
	    // Step 2: Traverse again and sum first half
	    int half = count / 2;
	    int index = 0;
	    int sum = 0;
	    current = head2;
	    while(current!=null && index<half)
	    {
	    	int data=current.data;
	    	sum=sum+data;
	    	current=current.nextLink;
	    	index++;;
	    }
	    return sum;
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
		int halfsum=list.halfSum(list.head);
		System.out.println("Half sum of the linkedlist:"+halfsum);
	}
}
