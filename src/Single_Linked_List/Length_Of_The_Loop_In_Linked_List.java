// https://youtu.be/I4g1qbkTPus
/*
 Given the head of a singly linked list, find the length of the loop in the linked list 
 if it exists. Return the length of the loop if it exists; otherwise, return 0.

A loop exists in a linked list if some node in the list can be reached again by 
continuously following the next pointer. Internally, pos is used to denote the 
index (0-based) of the node from where the loop starts.

Note that pos is not passed as a parameter.
 */
package Single_Linked_List;

import Single_Linked_List.Find_The_Starting_Point_Of_Linked_List.Node;

public class Length_Of_The_Loop_In_Linked_List 
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
	static Node head;
	public static int findLength()
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				int count=1;
				fast=fast.next;
				while(slow!=fast)
				{
					count++;
					fast=fast.next;
				}
				return count;
			}
		}
		return 0;	
	}
	
	public static void main(String[] args) 
	{
		SingleLinkedList3 sl=new SingleLinkedList3();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		System.out.println(sl);
		System.out.println(findLength());
	}
}
