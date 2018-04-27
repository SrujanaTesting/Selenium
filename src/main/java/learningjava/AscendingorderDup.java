package learningjava;

import java.util.Scanner;

public class AscendingorderDup {

	public static void main(String[] args) {
		
		int number,temp,reminder,count=0,count1;
		System.out.println("enter the input number");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		temp=number;
		while(temp>0)
		{
			reminder=temp%10;
			count++;
			temp=temp/10;
		}
		int[] a=new int[count];
		while(number>0)
		{
			reminder=number%10;
			//System.out.println(reminder);
			for(int i=0;i<count;i++)
			{	
				count1=0;
				for(int j=0;j<count;j++)
					{
						if(a[j]==reminder) 
							count1++;
					}
				if(count1>0)
					continue;
				else
				{
					a[i]=reminder;
					System.out.print(a[i]);
				}
				
			}
			number=number/10;
		}
		
		
	}

}
