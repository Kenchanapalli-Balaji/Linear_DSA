package Single_Linked_List;

import java.util.ArrayList;
import java.util.List;

public class LinkedListPalindrome 
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
	
	public static boolean isPalindrome()
	{
		List<Integer> list=new ArrayList<>();
		Node temp=head;
		while(temp!=null)
		{
			list.add(temp.data);
			temp=temp.next;
		}
		int start=0;
		int end=list.size()-1;
		while(start<=end)
		{
			if(list.get(start)!=list.get(end))
				return false;
			start++;
			end--;
		}
		return true;
		
	}
	public static void main(String[] args) 
	{
		SingleLinkedList3 sl=new SingleLinkedList3();
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(3);
		sl.add(2);
		sl.add(1);
		
		System.out.println(sl);
		System.out.println(isPalindrome());
	}
}

