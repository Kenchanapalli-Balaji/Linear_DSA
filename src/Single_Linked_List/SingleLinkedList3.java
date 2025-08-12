package Single_Linked_List;
 class SingleLinkedList3
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
	
	public void addFirst(int ele)
	{
		Node node=new Node(ele);
		if(head==null)
		{
			head=node;
			return;
		}
		node.next=head;
		head=node;
	}
	
	public void add(int ind,int ele)
	{
		if(ind==0)
		{
			addFirst(ele);
			return;
		}
		Node temp=head;
		while(temp.next!=null && ind>1)
		{
			temp=temp.next;
			ind--;
		}
		if(ind==1)
		{
			Node node=new Node(ele);
			node.next=temp.next;
			temp.next=node;
			return;
		}
		System.out.println("Index not in range");
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		head=head.next;
		
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		Node prev=null;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
		if(prev==null) //if only one element present in the List
		{
			head=null;
		}
		else
			prev.next=null;
	}
	
	public void delete(int ind)
	{
		if(ind==0)
		{
			deleteFirst();
			return;
		}
		Node temp=head;
		Node prev=null;
		while(temp!=null && ind>0)
		{
			prev=temp;
			temp=temp.next;
			ind--;
		}
		if(temp==null)
		{
			System.out.println("Index not in the range");
			return;
		}
		prev.next=temp.next;
		
	}
	
	public void del(int value)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node temp=head;
		Node prev=null;
		while(temp.next!=null)
		{
			if(temp.data==value)
				break;
			prev=temp;
			temp=temp.next;	
		}
		if(temp.data==value)
		{
			if(prev==null)// if we remove first element only
			{
				head=temp.next;
			}
			else
				prev.next=temp.next;
		}
	}
	
	
	public static void main(String[] args) 
	{
		SingleLinkedList3 sl=new SingleLinkedList3();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		System.out.println(sl);
		sl.add(2, 25);
		System.out.println(sl);
		sl.deleteFirst();
		System.out.println(sl);
		sl.deleteLast();
		System.out.println(sl);
		sl.add(50);
		sl.add(60);
		sl.add(70);
		System.out.println(sl);
		sl.delete(2);
		System.out.println(sl);
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