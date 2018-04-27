package myownpackage;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B;
		String text="The animal is good";
		Scanner scan=new Scanner(System.in);
		System.out.print("enter A value:");
		A=scan.nextInt();
		System.out.println();
		System.out.print("enter B value:");
		B=scan.nextInt();
		if(A==4)
			System.out.println(A);
		for(int i=0;i<6;i++)
		{
			System.out.println(i);
		}
		
	}

}
