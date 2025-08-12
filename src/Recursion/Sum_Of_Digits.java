package Recursion;

public class Sum_Of_Digits 
{
	public static void main(String[] args) {
		System.out.println(sum(1997));
	}
	static int sum(int n)
	{
		if(n>=-9 && n<=9)
			return n;
		return n%10+sum(n/10);
	}
}
