package myownpackage;

import java.util.Scanner;

public class LearningArrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] a={{1,2,3},{4,5,6}};
		int[] b= {1,2,3,4};
		
		for(int i:b)//i will go into array b and fetch the elements of b.here i represents single integer element.
		{
			System.out.println(i);
		}
	//Scanner scan=new Scanner(System.in);
	//In a two dimensional array every row is an array.
		for(int[] i:a)//i will go into two dimensional array and gives the first row which is an array.		{
		{
			for(int j:i)//j will go into one dimensional array i and fetch each elements of i.
			{
			System.out.println(j);
			}
		}
		
		
	}

}

