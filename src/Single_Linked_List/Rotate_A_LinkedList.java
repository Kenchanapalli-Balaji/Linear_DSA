// leetcode - 61
// https://youtu.be/uT7YI7XbTY8
/*
Given the head of a linked list, rotate the list to the right by k places.
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
 */
package Single_Linked_List;

import Single_Linked_List.Reverse_Nodes__In_K_Groups.Node;

public class Rotate_A_LinkedList 
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
	public Node rotate(Node head, int k)
	{
		int len=1;
		Node temp=head;
		while(temp.next!=null)
		{
			len++;
			temp=temp.next;
		}
		
		temp.next=head; // making the list as circular last node to head
		k = k % len;
		k = len-k; // if k value becomes negative
		
		while(k-- >0)  // finding the last node based on the given k Value
		{
			temp=temp.next;	
		}
		
		head=temp.next;
		temp.next=null;
		return head;
	}
	public static void main(String[] args) 
	{
		Rotate_A_LinkedList sl=new Rotate_A_LinkedList();
		int k=3;
		sl.add(1);sl.add(2);sl.add(3);sl.add(4);sl.add(5);sl.add(6);sl.add(7);sl.add(8);sl.add(9);sl.add(10);
		System.out.println(sl);
		sl.head=sl.rotate(sl.head, k);
		System.out.println("After Rotating "+k +" Times");
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
