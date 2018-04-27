package myownpackage;

import java.util.Scanner;


public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2;
		String operation;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number1");
		number1=scan.nextInt();
		System.out.println("enter number2");
		number2=scan.nextInt();
		System.out.println("enter operation name");
		operation=scan.next();
		operation.equals("ADD");
		//System.out.println(b);
		if(operation.equals("ADD"))	
			System.out.println(number1+number2);
		else if(operation.equals("SUBTRACT"))
			System.out.println(number1-number2);
		else if(operation.equals("MULTIPLY"))
			System.out.println(number1*number2);
		else if(operation.equals("DIVIDE"))
			System.out.println(number1/number2);
		else
			System.out.println("no operation name has specified");
	}

}
