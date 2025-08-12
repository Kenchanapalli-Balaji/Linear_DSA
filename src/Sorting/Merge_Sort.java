// https://youtu.be/SHqvb69Qy70?list=PLsyeobzWxl7rF6HYJBTNuXy3CNxDkDl3V
package Sorting;
import java.util.Arrays;

public class Merge_Sort 
{
	public static void main(String[] args) 
	{
		int arr[]= {9,8,7,6,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int arr[], int left, int right)
	{
		if(left<right)
		{
			int mid=left+(right-left)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	
	static void merge(int arr[], int left, int mid, int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;
		int l[]=new int[n1];
		int r[]=new int[n2];
		
		for(int i=0;i<n1;i++)
			l[i]=arr[left+i];
		
		for(int j=0;j<n2;j++)
			r[j]=arr[mid+1+j];
		 
		int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            }
            else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of l[] if any
        while (i < n1) {
            arr[k] = l[i];
            i++;
            k++;
        }

        // Copy remaining elements of r[] if any
        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
		
	}
	
	
}
