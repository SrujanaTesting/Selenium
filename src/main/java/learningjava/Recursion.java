package learningjava;

import java.util.Scanner;

public class Recursion {
	
	public void reverse()
	{
		int reminder,reverseNumber=0,temp,num=0;
		
			reminder=num%10;
			reverseNumber=reverseNumber*10+reminder;
			num=num/10;
			if(num>0)
				reverse();
				
		
		
			
	}

	public static void main(String[] args) {
		int inputNumber;
		System.out.println("enter the number");
		Scanner scan= new Scanner(System.in);
		inputNumber=scan.nextInt();
		Recursion rec=new Recursion();
		rec.reverse();
	}

}
