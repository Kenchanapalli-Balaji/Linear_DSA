package Hashing;
//https://youtu.be/44A_jk4_Rx8?si=0HGJ2adbS6j8suJ9package Hashing;

public class HashTable 
{
	class HashNode
	{
		int key;
		String value;
		HashNode next;
		public HashNode(int key, String value)
			{
				this.key=key;
				this.value=value;
			}
	}
	
	HashNode[] buckets;
	int size;
	public HashTable()
	{
		this(10);
	}
	public HashTable(int capacity)
	{
		this.buckets=new HashNode[capacity];
		this.size=0;
	}
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public int getBucketIndex(int key)
	{
		return key%buckets.length;
	}
	
	public void put(int key, String value)
	{
		int index=getBucketIndex(key);
		HashNode head=buckets[index];
		HashNode temp=head;
		while(temp!=null)
		{
			if(temp.key==key)
			{
				temp.value=value;
				return;
			}
			temp=temp.next;
		}
		size++;
		HashNode hn=new HashNode(key,value);
		if(buckets[index]==null)
		{
			buckets[index]=hn;
			return;
		}
		HashNode temp1=head;
		while(temp1.next!=null)
		{
			temp1=temp1.next;
		}
		temp1.next=hn;	
	}
	
	/*
	public void put(int key, String value)
	{	
		int bucketIndex=getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		while(head!=null)
		{
			if(head.key==key))
			{
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head=buckets[bucketIndex];
		HashNode node=new HashNode(key,value);
		node.next=head;
		buckets[bucketIndex]=node;
	}
	*/
	public void display()
	{
		for(int i=0;i<buckets.length;i++)
		{
			String st=i+" ->";
			HashNode temp=buckets[i];
			while(temp!=null)
			{
				st=st+"["+temp.key+","+temp.value+"]";
				if(temp.next!=null)
				{
					st=st+"->";
				}
				temp=temp.next;	
			}
			System.out.println(st);
		}
		//System.out.println();
		
	}
	public void get(int key)
	{
		int bucketIndex=getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		while(head!=null)
		{
			if(head.key==key)
			{
				System.out.println(head.value);
				return;
			}
				
			head=head.next;
		}
	}
	
	public String remove(int key)
	{
		int index=getBucketIndex(key);
		HashNode head=buckets[index];
		HashNode prev=null;
		while(head!=null)
		{
			if(head.key==key)
				break;
			prev=head;
			head=head.next;
		}
		if(head==null)
			return null;
		size--;
		if(prev!=null)
		{
			prev.next=head.next;
		}
		else
			buckets[index]=head.next;
		return head.value;
	}
	public static void main(String[] args) 
	{
		HashTable ht=new HashTable();
		ht.put(101,"Balaji");
		ht.put(102,"Deekshith");
		ht.put(103,"Vishnu");
		ht.put(1,"Sushanth");
		ht.put(121,"Sravani");
		ht.put(202,"Pandu");
		ht.put(11,"Bhargav");
		System.out.println("Size of the Hash Table is : "+ht.size());
		ht.display();
		ht.get(1);
		System.out.println(ht.remove(101));
		ht.display();
		
	}
}
