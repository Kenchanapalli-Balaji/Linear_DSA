/*
 Given an array of integers . For each element in the array , find its next greater 
 element in the array.
 The Next Greater element is the first element towards right, which is greater 
 than the current element.
 Example :
 	Input : {4,7,3,4,8,1};
 	Output : {7,8,4,8,-1,-1};
 */

package ArrayList;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stk=new Stack<>();
		int ar[]= {4,7,3,4,8,1};
		int res[]=new int[ar.length];
		/*
		for(int i=ar.length-1;i>=0;i--)
		{
			if(!stk.isEmpty())
			{
				while(!stk.isEmpty()&&stk.peek()<=ar[i])
				{
					stk.pop();
				}
			}
			if(stk.isEmpty())
			{
				res[i]=-1;
			}
			else
			{
				res[i]=stk.peek();
			}
			stk.push(ar[i]);
		}
		*/
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
				{
					res[i]=ar[j];
					break;
				}
				else
					res[i]=-1;
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(res));
	}
}
