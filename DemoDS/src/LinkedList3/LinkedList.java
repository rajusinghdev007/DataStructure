package LinkedList3;

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
	
	private int findKthFromEnd(int k) {
		Node leadPointer=head;
		Node followPointer=head;
		
		for(int i=0; i<k; i++)
		{
			if(leadPointer==null)
			{
				throw new IllegalArgumentException("The List is fewer Than "+k+" elements.");
			}
			leadPointer=leadPointer.nextLink;
		}
		while(leadPointer!=null)
		{
			leadPointer=leadPointer.nextLink;
			followPointer=followPointer.nextLink;
		}
		return followPointer.data;
	}

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        LinkedList list = new LinkedList();

	        System.out.print("Enter the number of elements in the list: ");
	        int len = sc.nextInt();
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < len; i++) {
	            list.insert(sc.nextInt());
	        }

	        System.out.print("Enter the position from the end (k): ");
	        int k = sc.nextInt();

	        try {
	            int result = list.findKthFromEnd(k);
	            System.out.println("The " + k + "th element from the end is: " + result);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
