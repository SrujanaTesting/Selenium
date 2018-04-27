package learningjava;

import java.util.Scanner;

public class FourDimensionalArray {

	public static void main(String[] args) {

		int[][] a=new int[4][4];
		System.out.println("enter array values");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<4;i++)
		{
			if(i==0) {
			for(int j=0;j<4;j++)
			{					
				System.out.print(a[i][j]+"  ");					
			}
			}
			else if(i==1)
				System.out.print(a[i][3]+"  ");
			else if(i==2)
				System.out.print(a[i][3]+"  ");
			else if(i==3)
			{
				for(int j=3;j<=0;j--)
				{
					System.out.print(a[i][j]+"  ");
				}
			}

		}
		
	}

}
