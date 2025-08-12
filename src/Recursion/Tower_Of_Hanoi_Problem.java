/*
 Rules:
 
 1. Only 1 disk can be move at a time.
 2. Larger disk can not be placed on smaller disk
 */
package Recursion;

public class Tower_Of_Hanoi_Problem 
{
	public static void main(String[] args) {
		tow(3,'S','T','D');
	}
	static void tow(int n, char src, char tem, char dst)
	{
		if(n==1)
		{
			System.out.println(n+" Disk move from "+src+" To "+dst);
			return;
		}
		tow(n-1, src,dst,tem);
		System.out.println(n+" Disk move from "+src+" To "+dst);
		tow(n-1,tem,src,dst);
	}
}
