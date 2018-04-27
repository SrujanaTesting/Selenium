package learningjava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber;
		System.out.println("Enter input number");;
		Scanner scan = new Scanner(System.in);
		inputNumber=scan.nextInt();
		int reverseNumber=0,reminder,temp;
		temp=inputNumber;
		while(inputNumber!=0)
		{
			reminder=inputNumber%10;
			reverseNumber=reverseNumber*10+reminder;
			inputNumber=inputNumber/10;
		}
		System.out.println(reverseNumber);
		if(reverseNumber==temp)
			System.out.println("Given number is Palindrome");
		else
			System.out.println("Given number is not Palindrome");

	}

}
