// leetcode - 25
// https://youtu.be/lIar1skcQYI
/*
 Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. 
If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.
Example 1 : 
===========
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
 */
package Single_Linked_List;

public class Reverse_Nodes__In_K_Groups 
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
	static Node reverse(Node head)
	{
		Node next=null; Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	static Node getKthNode(Node temp, int k)
	{
		k-=1;
		while(temp!=null && k>0)
		{
			k--;
			temp=temp.next;
		}
		return temp;
	}
	static Node kReverse(Node head, int k)
	{
		Node temp=head;
		Node prevlast=null;
		while(temp!=null)
		{
			Node kThNode=getKthNode(temp,k);
			if(kThNode==null)
			{
				if(prevlast!=null)
					prevlast.next=temp;
				break;
			}
			Node nextNode=kThNode.next;
			kThNode.next=null;
			reverse(temp);
			if(temp==head)
				head=kThNode;
			else
			{
				prevlast.next=kThNode;
			}
			prevlast=temp;
			temp=nextNode;	
		}
		return head;
		
	}
	
	public static void main(String[] args) 
	{
		Reverse_Nodes__In_K_Groups  sl=new Reverse_Nodes__In_K_Groups();
		int k=3;
		sl.add(1);sl.add(2);sl.add(3);sl.add(4);sl.add(5);sl.add(6);sl.add(7);sl.add(8);sl.add(9);sl.add(10);
		System.out.println(sl);
		sl.head=kReverse(sl.head, k);
		System.out.println("Reversed List:");
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
