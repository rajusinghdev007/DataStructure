package LinkedList2;

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
	
	private void insertAt(int index, int value) {
		if(index<0)
		{
            System.out.println("Invalid index.");
            return;
		}
		
		if(index==0)
		{
			insertAtStart(value);
			return;
		}
		
		Node newNode=new Node(value);
		Node current=head;
		
		for(int i=0; i<index-1; i++)
		{
	        if (current == null) {
                System.out.println("Index " + index + " is out of bounds.");
                return;
            }
	        current=current.nextLink;
		}
		current=current.nextLink;
	      if (current == null) {
	            System.out.println("Index " + index + " is out of bounds.");
	            return;
	        }
	      newNode.nextLink=current.nextLink;
	      current.nextLink=newNode;
	}
	
	
	 private void insertAtStart(int value) {
		// TODO Auto-generated method stub
		Node newNode=new Node(value);
		newNode.data=value;
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
		Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.print("Enter the number of elements in the list: ");
        int len = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < len; i++) {
            list.insert(sc.nextInt());
        }

        System.out.print("Enter the value to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter the index to insert at (0-based): ");
        int index = sc.nextInt();

        list.insertAt(index, value);	
		// Display the list
		System.out.println("Here is elements is :");
		list.display();
	}
}
