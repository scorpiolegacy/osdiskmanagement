package ossimulator;

import java.util.Arrays;
import java.lang.*;
public class c_scan {
	public void print(int [] arr, int size, int st)
	{
		 int k,j;
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
		 int min=arr[0];
		 int max=arr[size-1];
		 int diff_min=Math.abs(min);
		 int diff_max=Math.abs(max);
		 int start=0;
		 int index=0;
		 for(int i=0;i<size;i++)
		 {
			 if(st==arr[i])
			 {
				 index=i;
				 break;
			 }
		 }
		 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[st]));
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
			 for(int i=size-1;i>=index-1;i--)
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
			 for(int i=0;i<=index-1;i++)
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
