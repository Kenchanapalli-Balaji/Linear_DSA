package General_Programs;

public class TimeComplexityExample 
{
	public static int findSum(int n)
	{
		return n*(n+1)/2;
	}
//	public static int findSum(int n)
//	{
//		int sum=0;
//		for(int i=1;i<=n;i++)
//		{
//			sum=sum+i;
//		}
//		return sum;
//	}
	public static void main(String[] args) 
	{
		double now=System.currentTimeMillis();
		System.out.println("Sum of N natural Numbers is : "+findSum(99999));
		System.out.println("Time Taken : "+ (System.currentTimeMillis()-now)+" Milliseconds");
	}
}
