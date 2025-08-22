// leetcode - 2095
// https://youtu.be/ePpV-_pfOeI
/*
 You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, 
where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.
 */
package Single_Linked_List;

public class Delete_Middle_Node_In_Single_Linked_List 
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
	 //////////////////////////////// Brute Force Approach /////////////////////////
	 public void fun()
	 {
		 int n=0;
		 Node temp=head;
		 while(temp!=null)
		 {
			 n++;
			 temp=temp.next;
		 }
		 int ind=n/2;
		 temp=head;
		 while(temp!=null)
		 {
			 ind--;
			 if(ind==0)
			 {
				Node middle=temp.next;
				temp.next=temp.next.next;
				break;
			 }
			 temp=temp.next;
		 }
	 }
	 ////////////////////////////// Optimal Approach ////////////////////
	 public void fun2()
	 {
		 Node fast=head;
		 Node slow=head;
		 fast=fast.next.next; // since we need before the middle of the element we are skipping one iteration for slow
		 while(fast!=null && fast.next!=null)
		 {
			 fast=fast.next.next;
			 slow=slow.next;
		 }
		 slow.next=slow.next.next;
	 }
	public static void main(String[] args) 
	{
		Delete_Middle_Node_In_Single_Linked_List sl=new Delete_Middle_Node_In_Single_Linked_List();
		sl.add(1);sl.add(3);sl.add(4);sl.add(7);sl.add(1);sl.add(2);sl.add(6);
		System.out.println(sl);
		//sl.fun();
		sl.fun2();
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
