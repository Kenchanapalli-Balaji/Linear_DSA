package Single_Linked_List;

public class Circular_Single_LinkedList 
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
	Node last;
	public void add(int data)
	{
		Node n=new Node(data);
		if(last==null)
		{
			last=n;
			last.next=n;
			return;
		}
		n.next=last.next;
		last.next=n;
		last=n;
	}
	public void addFirst(int data)
	{
		Node n=new Node(data);
		if(last==null)
		{
			last=n;
			last.next=n;
		}
		else
		{
			n.next=last.next;
		}
		last.next=n;
	}
	public Object deleteFirst()
	{
		if(last==null)
		{
			System.out.println("List is empty");
			return null;
		}
		if(last.next==last)//If only One node is in LIST
		{
			last=null;
		}
		Node temp=last.next;
		last.next=temp.next;
		temp.next=null;
		return temp.data;
	}
	public Object deleteLast()
	{
		if(last==null)
		{
			System.out.println("List is empty");
			return null;
		}
		if(last.next==last)
		{
			last=null;
		}
		Node temp=last.next;
		while(temp.next!=last)
		{
			temp=temp.next;
		}
		int deleted=last.data;
		temp.next=last.next;
		last=temp;
		return deleted; 
	}
	public String toString()
	{
		String st="[";
		Node first=last.next;
		while(first!=last)
		{
			st=st+first.data;
			if(first!=last)
				st=st+"->";
			first=first.next;
		}
		return st+first.data+"]";
	}
	public static void main(String[] args)
	{
		Circular_Single_LinkedList csl=new Circular_Single_LinkedList();
		csl.add(10);
		csl.add(20);
		csl.add(30);
		csl.addFirst(5);
		System.out.println(csl);
		System.out.println(csl.deleteLast());
		System.out.println(csl);
	
	}
}
