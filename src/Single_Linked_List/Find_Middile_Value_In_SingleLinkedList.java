package Single_Linked_List;

public class Find_Middile_Value_In_SingleLinkedList 
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
	public int middile()
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	public String toString()
	{
		String st="[";
		Node temp=head;
		while(temp!=null)
		{
			st=st+temp.data;
			if(temp.next!=null)
				st=st+",";
			temp=temp.next;
		}
		return st+"]";
	}
	public static void main(String[] args)
	{
		Find_Middile_Value_In_SingleLinkedList sl=new Find_Middile_Value_In_SingleLinkedList();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		sl.add(50);
		sl.add(60);
		System.out.println(sl);
		System.out.println(sl.middile());
	}
}
