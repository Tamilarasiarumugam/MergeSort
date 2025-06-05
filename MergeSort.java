package assignments;
import java.util.Arrays;
public class MergeSort {
	
	public static void mergeSort(int[] arr1,int[] arr2,int n1,int n2,int[] arr3)
	{
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n1)
		{
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		
		 Arrays.sort(arr3);
		
	}
	
	public static void main(String[] args)
	{
		int[] arr1= {1,9,-4,-8,5,2};
		int n1=arr1.length;
		int[] arr2= {4,7,1,3,0,-5,-2,6};
		int n2=arr2.length;
		int[] arr3=new int[n1+n2];
		int n3=arr3.length;
		
		mergeSort(arr1,arr2,n1,n2,arr3);
		
//		for(int i=0;i<n3;i++)
//		{
//			System.out.print(arr3[i]+" ");
//		}
		
		for(int i=0;i<n3;i++)
		{
			int count=0;
			for(int j=i+1;j<n3;j++)
			{
				if(arr3[i]==arr3[j])
				{
					count++;
				}
				
			}
			if(count==0)
				System.out.print(arr3[i]+" ");
		}
	}

}

