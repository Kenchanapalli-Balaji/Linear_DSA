package Single_Linked_List;

public class LinkedList_Reverse 
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node head;
	public void add(int data)
	{
		Node n=new Node(data);
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
	}
	public void reverse()
	{
		Node curr=head;
		Node next=null;
		Node prev=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	public String toString()
	{
		String st="[";
		Node temp=head;
		while(temp!=null)
		{
			st=st+temp.data;
			if(temp.next!=null)
				st=st+"->";
			temp=temp.next;
		}
		return st+"]";
				
	}
	public static void main(String[] args) 
	{
		LinkedList_Reverse sl=new LinkedList_Reverse();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		sl.add(50);
		System.out.println(sl);
		sl.reverse();
		System.out.println(sl);
		sl.add(5);
		System.out.println(sl);
	}
}
