package ossimulator;

import java.util.Scanner;
import java.util.Arrays;

public class simulator {
	
	public static void main(String [] args )
	{
		
		int [] arr = new int[1000];
		Scanner in=new Scanner(System.in);
		int lens;
		System.out.println("Enter the number of tracks ");
		lens=in.nextInt();
		lens+=2;
		System.out.println("Enter the array for tracks");
		arr[0]=0;
		arr[lens-1]=199;
		for(int i=1;i<lens-1;i++)
			arr[i]=in.nextInt();
		int header;
		System.out.println("Enter the header position ");
		header=in.nextInt();
		System.out.println("Enter the menu :");
		System.out.println("1.FCFS");
		System.out.println("2. SSTF");
		System.out.println("3. SCAN");
		System.out.println("4. C SCAN");
		System.out.println("5. LOOK");
		System.out.println("6. C LOOK");
		
		int choice=in.nextInt();
		
		if(choice==1)
		{
			fcfs st=new fcfs();
			st.print(arr,lens,header);
		}
		
		else if(choice==2)
		{
			sstf st=new sstf();
			st.print(arr,lens,header);
		}
		
		else if(choice==3)
		{
			scan st=new scan();
			st.print(arr,lens,header);
		}
		
		else if(choice==4)
		{
			c_scan st=new c_scan();
			st.print(arr,lens,header);
		}
		
		else if(choice==5)
		{
			c_look st=new c_look();
			st.print(arr,lens,header);
		}
		
	/*	else if(choice==6)
		{
			c_look st=new c_look();
		}
		*/
		else
		{
			
		}
		
	}

}
