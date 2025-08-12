
package ArrayList;

import java.util.Arrays;

public class MyArrayList
{
	Object obj[];
	int capacity; 
	int ind=-1;
	
	MyArrayList()
	{
		this(10);
	}
	MyArrayList(int capacity)
	{
		this.capacity=capacity;
		obj=new Object[capacity];
	}
	
	public void add(Object ele)
	{
		if(ind==capacity-1)
		{
			grow();
		}
		obj[++ind]=ele;
	}
	public void grow()
	{
		capacity=capacity>>2;
		//capacity=capacity *3/2-1;
		Object nb[]=new Object[capacity];
			for(int i=0;i<ind;i++)
			{
				nb[i]=obj[i];
			}
			obj=nb;
	}
	
	public String toString()
	{
		return Arrays.toString(Arrays.copyOf(obj,ind+1));
	}
	
	public static void main(String[] args) 
	{
		MyArrayList al=new MyArrayList(6);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println(al);
		
		
	}
	
	
}


















