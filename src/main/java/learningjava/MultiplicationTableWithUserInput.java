package learningjava;

import java.util.Scanner;

public class MultiplicationTableWithUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tableNo,maxvalue;
		System.out.println("enter table number and maxvalue");
		Scanner scan=new Scanner(System.in);
		tableNo=scan.nextInt();
		maxvalue=scan.nextInt();
		
		System.out.println("multiplication table of " + tableNo + " is ") ;
		for(int i=1;i<=maxvalue;i++)
		{
			
			System.out.println(i +" * " +tableNo +" = " +(i*tableNo));
		}

	}

}
