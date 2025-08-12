// leetcode - 328
// https://youtu.be/qf6qp7GzD5Q
/*
Given the head of a singly linked list, group all the nodes with odd indices together 
followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should 
remain as it was in the input.
 Example : 
 	Input: head = [2,1,3,5,6,4,7]
	Output: [2,3,6,7,1,5,4]
*/
package Single_Linked_List;

import java.util.ArrayList;
import java.util.List;

import Single_Linked_List.SingleLinkedList3.Node;

public class Odd_And_Even_Linked_List 
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
	///////////////////////////////// Brute Force Approach //////////////////////
	public void fun()
	{
		List<Integer> list=new ArrayList<Integer>();
		Node odd=head;
		while(odd!=null && odd.next!=null)
		{
			list.add(odd.data);
			odd=odd.next.next;
		}
		if(odd!=null) // if last element is odd 
			list.add(odd.data);
		Node even=head.next;
		while(even!=null && even.next!=null)
		{
			list.add(even.data);
			even=even.next.next;
		}
		if(even!=null) // if last element is even 
			list.add(even.data);
		Node temp=head;
		for(int i=0;i<list.size();i++)
		{
			temp.data=list.get(i);
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) 
	{
		Odd_And_Even_Linked_List sl=new Odd_And_Even_Linked_List();
		sl.add(2);sl.add(1);sl.add(3);sl.add(5);sl.add(6);sl.add(4);sl.add(7);
		System.out.println(sl);
		sl.fun();
		System.out.println(sl);
	}
	public void add(int ele)
	{
		Node node=new Node(ele);
		if(head==null)
		{
			head=node;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=node;
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
