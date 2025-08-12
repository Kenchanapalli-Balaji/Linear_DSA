package Double_Linked_List;

public class DoubleLinkedList 
{	
	class Node
	{
		int data;
		Node prev;
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
		n.prev=temp;
	}
	
	public void addFirst(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		head.prev=n;
		n.next=head;
		head=n;
	}
	
	public void add(int ind,int data)
	{
		if(ind==0)
		{
			addFirst(data);
			return;
		}
		Node temp=head;
		while(temp.next!=null && ind>1)
		{
			temp=temp.next;
			ind--;
		}
		if(ind==1)
		{
			Node n=new Node(data);
			n.next=temp.next;
			n.prev=temp;
			temp.next=n;
			if(n.next!=null)
				n.next.prev=n;
			return;
		}
		System.out.println("Index not in range");
		
	}
	
	public Object deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return null; 
		}
		int deleted=head.data;
		head=head.next;
		if(head!=null)
			head.prev=null;
		return deleted;
		
	}
	
	public Object deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return null;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		int deleted=temp.data;
		if(temp.prev!=null)
		{
			temp.prev.next=null;
			temp.prev=null;
		}
		else
			head=null;
		return deleted;
		
	}
	
	@SuppressWarnings("unused")
	public Object delete(int ind)
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return null;
		}
		Node temp=head;
		while(temp.next!=null && ind>0)
		{
			temp=temp.next;
			ind--;
		}
		if(temp==null)
		{
			System.out.println("Index not in range");
			return null;
		}
		if(temp.next!=null)
		{
			temp.next.prev=temp.prev;
		}
		if(temp.prev!=null)
		{
			temp.prev.next=temp.next;
		}
		else
		{
			head=temp.next;
		}
		return temp.data;
	}
	
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
	
	public static void main(String[] args) 
	{
		DoubleLinkedList dl=new DoubleLinkedList();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		System.out.println(dl);
		dl.addFirst(5);
		System.out.println(dl);
		dl.add(2,15);
		System.out.println(dl);
		System.out.println(dl.deleteFirst());
		System.out.println(dl);
		System.out.println(dl.deleteLast());
		System.out.println(dl);
		dl.add(50);
		dl.add(60);
		dl.add(70);
		System.out.println(dl);
		dl.delete(3);
		System.out.println(dl);
		
	}
}
