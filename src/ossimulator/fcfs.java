package ossimulator;

public class fcfs 
{
	public void print(int [] arr, int size,int st)
	{
		System.out.println(Integer.toString(1)+"   "+Integer.toString(st));
		int count=2;
		for(int i=1;i<size;i++)
		{
			if(arr[i]!=st)
			{
			System.out.println(Integer.toString(count)+"   "+Integer.toString(arr[i]));
			count++;
			}
		}
	}
	
}
