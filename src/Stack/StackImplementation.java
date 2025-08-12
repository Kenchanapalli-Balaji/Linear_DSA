//stack Implementation Using Array
package Stack;

public class StackImplementation 
{
	Object obj[];
	int capacity;
	int top;
	StackImplementation(int capacity)
	{
		this.capacity=capacity;
		this.top=-1;
		obj=new Object[capacity];
	}
	
	
	public void push(Object data)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack is overflow");
			return;
		}
		obj[++top]=data;
		
	}
	
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
			return null;
		}
		return obj[top--];
	}
	
	public Object peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
			return null;
		}
		return obj[top];
	}
	public String toString()
	{
		String st="[";
		for(int i=0;i<=top;i++)
		{
			st=st+obj[i];
			if(i<top)
				st=st+",";
		}
		return st+"]";
	}
	
	public static void main(String[] args) 
	{
		StackImplementation st=new StackImplementation(5);
		st.push(4);
		st.push(5);
		st.push(1);
		st.push(8);
		st.push(10);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}
}
