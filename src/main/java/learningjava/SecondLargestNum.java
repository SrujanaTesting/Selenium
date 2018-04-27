package learningjava;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,temp;
		System.out.println("enter size value");
		Scanner scan=new Scanner(System.in);
		size=scan.nextInt();
		int[] array=new int[size];
		System.out.println("enter array values");
		for(int i=0;i<size;i++)
		{
			array[i]=scan.nextInt();
		}
		
		/*for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}*/
		//or
		Arrays.sort(array);
		for(int i=0;i<size;i++)
			System.out.println(array[i]);
		System.out.print(array[size-2]+"   is second maximum number");
		
			}

}
