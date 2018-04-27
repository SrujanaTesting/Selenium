package myownpackage;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowVal,number=1;
		
		System.out.println("enter no.of rows");
		Scanner scan= new Scanner(System.in);
		rowVal=scan.nextInt();
		for(int i=1;i<=rowVal;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+"   ");
				number++;
			}
			
			System.out.println();
		}
				
		}

}
