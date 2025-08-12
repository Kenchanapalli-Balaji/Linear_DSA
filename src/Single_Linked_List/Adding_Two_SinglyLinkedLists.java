// Adding Numbers From left to Right side
// leetcode -2 
package Single_Linked_List;
public class Adding_Two_SinglyLinkedLists
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
		public void add(int data)
		{
			Node n=new Node(data);
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
	static Adding_Two_SinglyLinkedLists add(Adding_Two_SinglyLinkedLists sl1,Adding_Two_SinglyLinkedLists sl2)
		{
			Node t1=sl1.head;
			Node t2=sl2.head;
			Adding_Two_SinglyLinkedLists sl=new Adding_Two_SinglyLinkedLists();
			int carry=0;
			while(t1!=null&&t2!=null)
			{
				int sum=t1.data+t2.data+carry;
				sl.add(sum%10);
				t1=t1.next;
				t2=t2.next;
				carry=sum/10;
			}
			Node temp=null;
			if(t1!=null)
				temp=t1;
			if(t2!=null)
				temp=t2;
			while(temp!=null)
			{
				int sum=temp.data+carry;
				sl.add(sum%10);
				carry=sum/10;
				temp=temp.next;			
			}
			if(carry !=0)
				sl.add(carry);
			return sl;
		}
		public String toString()
		{
			String st="[";
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
			return st+"]";
		}
	public static void main(String[] args)
	{
		Adding_Two_SinglyLinkedLists sl1=new Adding_Two_SinglyLinkedLists();
		sl1.add(8);
		sl1.add(0);
		sl1.add(9);
		sl1.add(8);
		sl1.add(9);
		Adding_Two_SinglyLinkedLists sl2=new Adding_Two_SinglyLinkedLists();
		sl2.add(6);
		sl2.add(4);
		sl2.add(12);
		System.out.println(sl1);
		System.out.println(sl2);
		System.out.println(add(sl1,sl2));
	}
}
