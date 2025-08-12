package Double_Linked_List;

class DoubleLinkedList1
{
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node head;
	public void add(int ele)
	{
		Node n=new Node(ele);
		if(head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
		n.prev=temp;
	}
	
	public void printReverseOrder(Node head)
	{
		if(head.next!=null)
			printReverseOrder(head.next);
		System.out.println(head.data+" ");
	}
	
	
	public void reverse()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			Node t=temp.next;
			temp.next=temp.prev;
			temp.prev=t; // temp.prev=t; 
			temp=t;
		}
		temp.next=temp.prev;
		temp.prev=temp.next;
		head=temp;
		
	}
//	public void reverse()
//	{
//		Node temp=head;
//		Node th=head;
//		while(temp!=null)
//		{
//			th=temp;
//			Node curr=temp.next;
//			temp.next=temp.prev;
//			temp.prev=curr;
//			temp=curr;
//		}
//		head=th;
//	}
	public String toString()
	{
		String st="";
		Node temp=head;
		while(temp!=null)
		{
			st=st+temp.data;
			if(temp.next!=null)
			{
				st=st+"<=>";
			}
			temp=temp.next;
		}
		return st;
	}
}
public class DoubleLinkedList_Reverse 
{
	public static void main(String[] args) 
	{
		DoubleLinkedList1 dl=new DoubleLinkedList1();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.add(50);
		System.out.println(dl);
		dl.reverse();
		System.out.println(dl);
	}
}
