package General_Programs;

import java.util.Arrays;

public class Demo 
{
	
	public static void main(String[] args) 
	{
		int arr[]= {9,8,7,6,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr, int left, int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	static void merge(int[] arr, int left, int mid, int right)
	{
		int n1=mid-left+1; int n2=right-mid;
		int[] l=new int[n1]; int[] r=new int[n2];
		for(int i=0;i<n1;i++)
		{
			l[i]=arr[left+i];
		}
		for(int i=0;i<n2;i++)
			r[i]=arr[mid+1+i];
				
		int k=left; int i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(l[i]<r[j])
			{
				arr[k]=l[i];
				i++;
			}
			else
			{
				arr[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=l[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=r[j];
			j++;
			k++;
		}
	}
}