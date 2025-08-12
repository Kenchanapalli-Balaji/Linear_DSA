package Recursion;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int arr[]= {12,32,34,54,56,78};
		int in=search(arr, 56);
		if(in<0)
			System.out.println("Element not present");
		else
			System.out.println("Element present at :"+ in);
	}
	static int search(int arr[], int ele)
	{
		return search(arr, ele, 0, arr.length-1);
	}
	static int search(int arr[], int ele, int low, int high)
	{
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(arr[mid]==ele)
			return mid;
		if(ele<arr[mid])
			return search(arr, ele,0,mid-1);
		else
			return search(arr, ele, mid+1,high);
	}
}
