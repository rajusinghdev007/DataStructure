package LinkedList19;
import java.net.SecureCacheResponse;
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
	
	//combined element print 
	private void jointLists(Node head2, Node head3) {
		Node dummy=new Node(0);
		Node current=dummy;
		while(head2!=null || head3!=null)
		{
			while(head2!=null)
			{
				current.nextLink=new Node(head2.data);
				current=current.nextLink;
				head2 = head2.nextLink;
			}
			while(head3!=null)
			{
				current.nextLink=new Node(head3.data);
				current=current.nextLink;
				head3 = head3.nextLink;
			}
		}
		this.head=dummy.nextLink;
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
		System.out.println("Enter the length of LinkedList 1:");
		int len1=sc.nextInt();		
		int[] arr1=new int[len1];
		LinkedList list1=new LinkedList();
		System.out.println("Enter element of LinkedList 1:");
		for(int i=0; i<len1; i++)
		{
			arr1[i]=sc.nextInt();
			list1.insert(arr1[i]);
		}
		System.out.println("");
		System.out.println("Enter the length of LinkedList 2:");
		int len2=sc.nextInt();		
		int[] arr2=new int[len2];
		LinkedList list2=new LinkedList();
		System.out.println("Enter element of LinkedList 2:");
		for(int i=0; i<len2; i++)
		{
			arr2[i]=sc.nextInt();
			list2.insert(arr2[i]);
		}	
		System.out.println("");
		LinkedList combinedList = new LinkedList();
		combinedList.jointLists(list1.head, list2.head);
		
		// Display the list
		System.out.println("Here is elements is :");
		combinedList.display();
	}
}
