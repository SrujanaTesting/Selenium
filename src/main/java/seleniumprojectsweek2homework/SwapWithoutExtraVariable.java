package seleniumprojectsweek2homework;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class SwapWithoutExtraVariable {
	
		int a,b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapWithoutExtraVariable swap = new SwapWithoutExtraVariable();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a value");
		
		swap.a=scan.nextInt();
		
		System.out.println("enter b value");
		swap.b=scan.nextInt();
		SwapWithoutExtraVariable swap1=new SwapWithoutExtraVariable();
		swap1.a=swap.b;
		swap1.b=swap.a;
		System.out.println("a value is    "+swap1.a+"         b value is    "+swap1.b);
		/*
		 int a,b;
		 System.out.println("enter a,b values");
		 Scanner scan = new Scanner(System.in);
		 a=scan.nextInt();
		 b=scan.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println(a+""+b);

*/
	}
	

}
