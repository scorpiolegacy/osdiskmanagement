package ossimulator;

import java.util.Arrays;
import java.lang.*;
public class c_look {
	public void print(int [] arr, int size, int st)
	{
		 Arrays.sort(arr);
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
				 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[i]));
				 start++;
			 }
			 for(int i=size-1;i>=index-1;i--)
			 {
				 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[i]));
				 start++;
			 }
		 }	
		 else
		 {
			 for(int i=index+1;i<size;i++)
			 {
				 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[i]));
				 start++;
			 }
			 for(int i=0;i<=index-1;i++)
			 {
				 System.out.println(Integer.toString(start)+"   "+Integer.toString(arr[i]));
				 start++;
			 }
		 }
	}
}
