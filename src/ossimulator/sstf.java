package ossimulator;
import java.lang.*;
public class sstf 
{
	public void print(int [] arr, int size, int st)
	{
	int[] visit= new int[size];
	 int min,s=1,i;
	 int index=0;
	 
	 while(true)
	{
	  min=1000;
	  for(i=0;i<size;i++)
	   if (visit[i] == 0)
	    {
	      if(min > Math.abs(st - arr[i]))
	       {
	        min = Math.abs(st-arr[i]);
	        index = i;
	        }
	      }
	 if(min == 1000)
	  break;
	  visit[index]=1;
	  //s=s + min;
	 // st = arr[p];
	  System.out.println(Integer.toString(s)+"   "+Integer.toString(arr[index]));
	  s++;
	  
	}
	 }

}
