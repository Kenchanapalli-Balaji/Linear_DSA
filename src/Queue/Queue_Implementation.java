package Queue;

//Using LinkedList Implementation of Queue

public class Queue_Implementation
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
	Node front;
	Node rear;
	public void enque(int data)
	{
		Node n=new Node(data);
		if(front==null)
		{
			front=n;
		}
		else
		{
			rear.next=n;
		}
		rear=n;
	}
	public void deque()
	{
		if(front==null)
		{
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(front.data);
		front=front.next;
		if(front==null)
			rear=null;
	}
	public String toString()
	{
		String st="[";
		Node temp=front;
		while(temp!=null)
		{
			st=st+temp.data;
			if(temp!=rear)
				st=st+",";
			temp=temp.next;
		}
		return st+"]";
	}
	public static void main(String[] args)
	{
		Queue_Implementation q=new Queue_Implementation();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		System.out.println(q);
		q.deque();
		System.out.println(q);
	}
}







//Using Array implementation of Queue


/*
public class Queue_Implementation 
{
	int obj[];
	int capacity,front,rear;
	Queue_Implementation(int capacity)
	{
		this.capacity=capacity;
		obj=new int[capacity];	
		rear=front=-1;
	}
	public void enque(int data)
	{
		if(rear==capacity-1)
		{
			System.out.println("Queue is full");
			return;
		}
		if(front==-1)
		{
			front=0;
		}
		obj[++rear]=data;
	}
	public Object deque()
	{
		if(front==-1)
		{
			System.out.println("Queu is Empty");
			return null;
		}
		int data=obj[front++];
		if(front>rear)
			rear=front=-1;
		return data;
	}
	
	public String toString()
	{
		String st="[";
		for(int i=front;i<=rear;i++)
		{
			st=st+obj[i];
			if(i<rear)
				st=st+",";
		}
		return st+"]";
	}
	public static void main(String[] args) 
	{
		Queue_Implementation q=new Queue_Implementation(5);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		System.out.println(q);
		System.out.println(q.deque());
		System.out.println(q);
	}
	
}
*/
