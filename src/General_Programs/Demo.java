package General_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo 
{
	
	public static void main(String[] args) 
	{
		int arr[][]= {{1,2,3},
				  {4,5,6},
				  {7,8,9}};
		List<Integer> list=new ArrayList<Integer>();
		int top=0; int bottom=arr.length-1;
		int left=0; int right=arr[0].length-1;
		while(top<=bottom && left<=right)
		{
			for(int i=left;i<=right;i++)
			{
				list.add(arr[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++)
				list.add(arr[i][right]);
			right--;
			if(!(top<=bottom && left<=right))
				break;
			for(int i=right;i>=left;i--)
				list.add(arr[bottom][i]);
			bottom--;
			for(int i=bottom;i>=top;i--)
				list.add(arr[i][left]);
			left++;
			
		}
		System.out.println(list);
	}
}