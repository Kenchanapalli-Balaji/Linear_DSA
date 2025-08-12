package ArrayList;

import java.util.Arrays;

public class Array
{
	/* 
	 public  String toString()
	{
		String st="[";
		for(int i=0;i<ar.length;i++)
		{
			st=st+ar[i];
			if(i<ar.length-1)
				st=st+",";
		}
		return st+"]";
	}
	 */
	
	public static void main(String[] args) 
	{
		int x[]= {1,2,3,4,5,6,7,8};
		int y[]=x;// y is alias of x
		y[1]=22;
		System.out.println(Arrays.toString(x));
		System.out.println(x[1]);
		
		/*
		int z[]=new int[x.length];
		for(int i=0;i<z.length;i++)
		{
			z[i]=x[i];
		}*/
		int z[]=Arrays.copyOf(x,x.length);//z is a duplicate copy of x
		z[1]=2;
		System.out.println(x[1]);
		
		System.out.println(Arrays.toString(z));
	}
}
