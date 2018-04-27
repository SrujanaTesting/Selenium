package seleniumprojectsweek2homework;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a,b values");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.print(a+"  ");
		for(int i=a+1;i<=b;i++)
		{
			if(i%3==0&&i%5==0)
				System.out.print("FIZZBUZZ"+"  ");
			else if(i%3==0)
				System.out.print("FIZZ"+"  ");
			else if(i%5==0)
				System.out.print("BUZZ"+"  ");
			
			else
				System.out.print(i+"  ");
		
		}
	}

}
