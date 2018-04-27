package learningjava;

import java.util.Scanner;

public class LearningArraysWithUserInput {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		int rows,columns;
		System.out.println("enter array row and column value");
		Scanner scan=new Scanner(System.in);
		rows=scan.nextInt();
		columns=scan.nextInt();
		int a[][]=new int[rows][columns];

		System.out.println("enter array values");

		int x=2;
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(j==0)
				{//System.out.println(nameBloodGroup[i][j] +"   " +nameBloodGroup[i][j+1]);
					System.out.println();
					System.out.print(a[i][j]+"    ");
					System.out.print(a[i][j+1]);
				}
			}
		}
		

				
	}

}
