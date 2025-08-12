package Recursion;

public class Count_Digits_Of_Number
{
	public static void main(String[] args) {
		System.out.println(count(1997));
	}
	static int count(int n)
	{
		if(n>=-9 && n<=9)
			return 1;
		return 1+count(n/10);
	}
}
