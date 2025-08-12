package Sorting;
import java.util.Arrays;

public class Quick_Sort 
{
	public static void main(String[] args) {
		int arr[]= {9,8,7,6,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int p=partition(arr, low, high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}
	}
	static int partition(int arr[], int low, int high)
	{
		// First element as pivot
        int pivot = arr[low];
        int k = high;
        for (int i = high; i > low; i--) {
            if (arr[i] > pivot)
                swap(arr, i, k--);
        }
        swap(arr, low, k);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return k;
	}
	
	 public static void swap(int[] arr, int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
}
