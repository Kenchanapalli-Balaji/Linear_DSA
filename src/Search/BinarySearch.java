/*
 step 1: Begin with the mid element of the whole array as a search key.
 step 2: If the value of the search key is equal to the item then return an index of the 
          search key.
 step 3: Or if the value of the search key is less than the item in the middle of the interval, 
 		narrow the interval to the lower half.
 step 4:Otherwise, narrow it to the upper half.
 step 5:Repeatedly check from the second point until the value is found or the interval is empty.
 */

package Search;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println(search(ar,11));
	}

	private static int search(int[] ar, int num) 
	{
		int low=0;
		int high=ar.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(ar[mid]==num)
				return mid;
			if(num<ar[mid])
				high=mid-1;
			else if(num>ar[mid])
				low=mid+1;
		}
		return -1;
	}
}
