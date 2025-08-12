// leetcode - 142
// https://youtu.be/2Kd0KKmmHFc
/*
 Given the head of a linked list, return the node where the cycle begins. 
 If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached 
again by continuously following the next pointer. Internally, pos is used to denote the 
index of the node that tail's next pointer is connected to (0-indexed). 
It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

 */
package Single_Linked_List;

import java.util.HashMap;
import java.util.Map;

public class Find_The_Starting_Point_Of_Linked_List 
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
	
	//////////////////////////// Brute Force Approach ///////////////
	/*
	public Node startPoint()
	{
		Map<Node, Integer> map=new HashMap<Find_The_Starting_Point_Of_Linked_List.Node, Integer>();
		Node temp=head;
		while(temp.next!=null)
		{
			if(map.containsKey(temp))
				return temp;
			map.put(temp, map.getOrDefault(temp, 0)+1);
			temp=temp.next;
		}
		return null;
	}
	*/
	
	/////////////////////////// Optimal Approach ////////////////////
	public static Node startPoint()
	{
		// step1 : Detecting the loop
		// step2 : Finding the starting Point
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				slow=head;
				while(slow!=fast)
				{
					slow=slow.next;
					fast=fast.next;
				}
				return slow; // return fast;
			}
		}
		return null;
	}
	public static void main(String[] args) 
	{
		SingleLinkedList3 sl=new SingleLinkedList3();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		System.out.println(sl);
		System.out.println(startPoint()); 
		
	}
}
