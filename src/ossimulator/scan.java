package ossimulator;

import java.util.*;
import java.lang.*;
public class scan {
	public void print(int [] arr, int size, int st)
	{
		 
		 int min=arr[0];
		 int max=arr[size-1];
		 int diff_min=Math.abs(st-min);
		 int diff_max=Math.abs(st-max);
		 int start=0;
		 int index=0;
		 int j;
		 for(j=0;j<size;j++)
		 {
			 System.out.println(arr[j]);
			 if(arr[j]==st)
			 {
				 index=j;
				 break;
			 }
		 }
		// Arrays.sort(arr);
		 int k;
		 for(k=0;k<size;k++)
		 {
			 for(j=k;j<size;j++)
			   {
				   if(arr[k]>arr[j])
			   {
			    int t=arr[k];
			    arr[k] = arr[j];
			    arr[j] = t;
			    }
			   }
		}
		 System.out.println(index);
		 System.out.println(Integer.toString(start)+"   "+Integer.toString(st));
		 start++;
		 if(diff_min<diff_max)
		 {
			 for(int i=index-1;i>=0;i--)
			 {
				 if(i!=st)
				 {
					 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[i]));
					 start++;
				 }
			 }
			 for(int i=index+1;i<size;i++)
			 {
				 if(i!=st)
				 {
				 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[i]));
				 start++;
				 }
			 }
		 }	
		 else
		 {
			 for(int i=index+1;i<size;i++)
			 {
				 if(i!=st)
				 {
					 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[i]));
					 start++;
				 }
			 }
			 for(int i=index-1;i>=0;i--)
			 {
				 if(i!=st)
				 {
				 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[i]));
				 start++;
				 }
			 }
		 }
}
}