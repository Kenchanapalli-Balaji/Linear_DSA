// leetcode - 2487
/*
  -> Remove every node which has a node with a greater value anywhere to the 
  	right side of it.
  	Input: head = [5,2,13,3,8]
	Output: [13,8]
	Explanation: The nodes that should be removed are 5, 2 and 3.
		- Node 13 is to the right of node 5.
		- Node 13 is to the right of node 2.
		- Node 8 is to the right of node 3.
 */
package Single_Linked_List;

import java.util.Stack;

class SingleLinkedList2
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
	
	public static SingleLinkedList2  removeNodes(Node head)
	{
		Stack<Integer> st1=new Stack<>();
		Stack<Integer> st2=new Stack<>();
		Node temp=head;
		while(temp!=null)
		{
			st1.push(temp.data);
			temp=temp.next;
		}
		st2.push(st1.pop());
		while(!st1.empty())
		{
			if(st2.peek()>st1.peek())
			{
				st1.pop();
			}
			else
				st2.push(st1.pop());
		}
		SingleLinkedList2 result=new SingleLinkedList2();
		while(!st2.empty())
		{
			result.add(st2.pop());
		}
		return result;
	}
}
public class RemoveNodesFromSingleLinkedList 
{
	public static void main(String[] args) 
	{
		SingleLinkedList2 sl=new SingleLinkedList2();
		sl.add(5);
		sl.add(2);
		sl.add(13);
		sl.add(3);
		sl.add(8);
		System.out.println(sl);
		SingleLinkedList2 res=sl.removeNodes(sl.head);
		System.out.println(res);
	}
}
