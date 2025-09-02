// https://youtu.be/aXQWhbvT3w0
/*
 Given the head of a singly linked list representing a positive integer number. 
 Each node of the linked list represents a digit of the number, with the 1st node containing the 
 leftmost digit of the number and so on. The task is to add one to the value represented by the 
 linked list and return the head of a linked list containing the final value.
The number will contain no leading zeroes except when the value represented is zero itself.
Examples:
Input: head -> 1 -> 2 -> 3

Output: head -> 1 -> 2 -> 4

Explanation: The number represented by the linked list = 123.

123 + 1 = 124.
 */
package Single_Linked_List;

import Single_Linked_List.Adding_Two_SinglyLinkedLists.Node;

public class Plus_One_In_Single_Linked_List 
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
	public void fun()
	{
		reverse();
		Node temp=head;
		int carry=1;
		while(temp!=null)
		{
			temp.data=temp.data+carry;
			if(temp.data<10)
			{
				carry=0;
				break;
			}
			else
			{
				temp.data=0;
				carry=1;
			}
			temp=temp.next;
		}
		reverse();
		if(carry==1) // where if we give list as [9->9->9], output should be [1->0->0->0]
		{
			Node newNode=new Node(1);
			newNode.next=head;
			head=newNode;
		}
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
	public static void main(String[] args) 
	{
		Plus_One_In_Single_Linked_List sl=new Plus_One_In_Single_Linked_List();
		sl.add(9);sl.add(9);sl.add(9);
		System.out.println(sl);
		sl.fun();
		System.out.println(sl);
		
	}
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
}
