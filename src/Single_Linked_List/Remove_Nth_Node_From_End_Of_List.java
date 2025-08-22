// leetcode - 19
// https://youtu.be/3kMKYQ2wNIU
/*
 Given the head of a linked list, remove the nth node from the end of the list and return its head.
 Example :
 ==========
    Input: head = [1,2,3,4,5], n = 2
	Output: [1,2,3,5]
 */
package Single_Linked_List;

public class Remove_Nth_Node_From_End_Of_List 
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
	 ////////////////////////////////// BruteForce Approach ////////////////////////
	 public void fun(int n)
	 {
		  int count=0;
		  Node temp=head;
		  while(temp!=null)
		  {
			  count++;
			  temp=temp.next;
		  }
		// If N equals the total number of nodes, delete the head
		  if(count==n)
		  {
			  head=head.next;
		  }
		  
		// Calculate the position of the node to delete (index)
		  int ind=count-n;
		  temp=head;
		// Traverse to the node just before the one to delete
		  while(temp!=null)
		  {
			  ind--;
			  if(ind==0)
				  break;
			  temp=temp.next;
		  }
		// Delete the Nth node from the end
		  Node delNode=temp.next;
		  temp.next=temp.next.next;
		  delNode = null;
	 }
	 
	 
	public static void main(String[] args) 
	{
		Remove_Nth_Node_From_End_Of_List sl=new Remove_Nth_Node_From_End_Of_List();
		sl.add(1);sl.add(2);sl.add(3);sl.add(4);sl.add(5);
		System.out.println(sl);
		sl.fun(2);
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
