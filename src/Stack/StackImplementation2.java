//Stack Implementation USing LinkedList
package Stack;
public class StackImplementation2 
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
	Node top;
	public void push(int data)
	{
		Node n=new Node(data);
		if(top==null)
			top=n;
		else
		{
			n.next=top;
			top=n;
		}
	}
	int pop()
	{
		if(top==null)
		{
			System.out.println("Stack is Underflow");
			return -1;
		}
		int data=top.data;
		top=top.next;
		return data;
	}
	
	int peek()
	{

		if(top==null)
		{
			System.out.println("Stack is Underflow");
			return -1;
		}
		return top.data;
	}
	
	public String toString()
	{
		String st="[";
		Node temp=top;
		while(temp!=null)
		{
			st=st+temp.data;
			if(temp.next!=null)
				st=st+",";
			temp=temp.next;
		}
		return st+"]";
	}
	public static void main(String[] args) 
	{
		StackImplementation2  o=new StackImplementation2();
		o.push(1);
		o.push(2);
		o.push(3);
		o.push(4);
		o.push(5);
		System.out.println(o);
		System.out.println(o.pop());
		System.out.println(o);
	}
}
