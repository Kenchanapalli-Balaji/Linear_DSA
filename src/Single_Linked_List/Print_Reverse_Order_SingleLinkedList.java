package Single_Linked_List;

import java.util.Stack;

class SingleLinkedList
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
	}
	public String printReverseOrder()
	{
		String st="";
		Stack<Integer> stk=new Stack<>();
		Node temp=head;
		while(temp!=null)
		{
			stk.push(temp.data);
			temp=temp.next;
		}
		while(!stk.isEmpty())
		{
			st=st+stk.pop();
			if(stk.size()>=1)
				st=st+"->";
		}
		return st;	


		// OR //
/*
		
		public void printReverseOrder(Node head)
		{
			if(head.next!=null)
				printReverseOrder(head.next);
			System.out.println(head.data+" ");
		}
*/
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
				st=st+"->";
			}
			temp=temp.next;
		}
		return st;
	}
}
public class Print_Reverse_Order_SingleLinkedList
{
	public static void main(String[] args) {
		
		SingleLinkedList sl=new SingleLinkedList();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		sl.add(50);
		System.out.println(sl);
		System.out.println(sl.printReverseOrder());
	}
}
