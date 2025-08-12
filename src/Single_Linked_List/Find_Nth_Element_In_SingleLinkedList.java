package Single_Linked_List;

import java.util.Arrays;

public class Find_Nth_Element_In_SingleLinkedList 
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
	
	public int find(int n) // From forward Direction
	{
		Node temp=head;
		while(temp.next!=null&&n>0)
		{
			temp=temp.next;
			n--;
		}
		return temp.data;
	}
	public int findrev(int n) // from Backward Direction
	{
		Node mainptr=head;
		Node refptr=head;
		int count=0;
		while(count<=n)
		{
			refptr=refptr.next;
			count++;
		}
		while(refptr!=null)
		{
			refptr=refptr.next;
			mainptr=mainptr.next;
		}
		return mainptr.data;
	}
	
	public static void main(String[] args) 
	{
		Find_Nth_Element_In_SingleLinkedList sl=new Find_Nth_Element_In_SingleLinkedList();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		sl.add(50);
		System.out.println(sl);
		System.out.println(sl.find(2));
		System.out.println(sl.findrev(2));
		
	}
		
}
