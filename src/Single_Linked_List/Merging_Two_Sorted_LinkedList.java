package Single_Linked_List;
public class Merging_Two_Sorted_LinkedList 
{
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
		public String toString()
		{
			String st="[";
			Node temp=head;
			while(temp!=null)
			{
				st=st+temp.data;
				if(temp.next!=null)
				{
					st=st+"->";
				}
				temp=temp.next;
			}
			return st+"]";
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
	
	public String toString()
	{
		String st="[";
		Node temp=head;
		while(temp!=null)
		{
			st=st+temp.data;
			if(temp.next!=null)
			{
				st=st+"->";
			}
			temp=temp.next;
		}
		return st+"]";
	}
	
	public  Node merge(Node a1,Node b1)
	{

		Node dummy=new Node(0);
		Node temp=dummy;
		while(a1!=null&&b1!=null)
		{
			if(a1.data<=b1.data)
			{
				temp.next=a1;
				a1=a1.next;
			}
			else
			{
				temp.next=b1;
				b1=b1.next;
			}
			temp=temp.next;
		}
		if(a1==null)
		{
			temp.next=b1;
		}
		else
		{
			temp.next=a1;
		}
			
		return dummy.next;
		
	}
	public static Merging_Two_Sorted_LinkedList merging(Node a, Node b)
	{
		Merging_Two_Sorted_LinkedList res=new Merging_Two_Sorted_LinkedList();
		while(a!=null && b!=null)
		{
			if(a.data<b.data)
			{
				res.add(a.data);
				a=a.next;
			}
			else
			{
				res.add(b.data);
				b=b.next;
			}
		}
		if(a!=null)
		{
			res.add(a.data);
		}
		if(b!=null)
			res.add(b.data);
		return res;
	}
	
	public static void main(String[] args) 
	{
		Merging_Two_Sorted_LinkedList a=new Merging_Two_Sorted_LinkedList();
		Merging_Two_Sorted_LinkedList b=new Merging_Two_Sorted_LinkedList();
		a.add(1);
		a.add(4);
		a.add(8);
		b.add(3);
		b.add(6);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.merge(a.head, b.head));
		merging(a.head, b.head);
		
	}
}
