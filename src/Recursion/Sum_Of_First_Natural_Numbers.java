package Recursion;

public class Sum_Of_First_Natural_Numbers 
{
	public static void main(String[] args) {
		System.out.println(fun(5));
	}
	static int fun(int n)
	{
		if(n==0)
			return 0;
		return n+fun(n-1);
	}
}
