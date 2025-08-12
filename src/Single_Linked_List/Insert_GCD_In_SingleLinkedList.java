//Leetcode - 2807
/*
 Input: head = [18,6,10,3]
Output: [18,6,6,2,10,1,3]
Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes 
	the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
- We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
- We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
- We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
There are no more adjacent nodes, so we return the linked list.
 */
package Single_Linked_List;

class SingleLinkedList1
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
	
	public void insertGreatestCommonDivisors(Node sl)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			int gcd=gcd(temp.data, temp.next.data);
			Node n=new Node(gcd);
			n.next=temp.next;
			temp.next=n;
			temp=temp.next.next;
		}
		
	}
	public static int gcd(int a, int b)
	{
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
}
public class Insert_GCD_In_SingleLinkedList 
{
	public static void main(String[] args) 
	{
		SingleLinkedList1 sl=new SingleLinkedList1();
		sl.add(18);
		sl.add(6);
		sl.add(10);
		sl.add(3);
		System.out.println(sl);
		sl.insertGreatestCommonDivisors(sl.head);
		System.out.println(sl);
		
	}
}
