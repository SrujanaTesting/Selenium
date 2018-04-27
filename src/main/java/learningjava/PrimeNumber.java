package learningjava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeInput,count=0,i=1;
		System.out.println("enter inputnumber");
		Scanner scan=new Scanner(System.in);
		primeInput=scan.nextInt();
		
		//using for loop;
		
		for(i=1;i<=primeInput;i++)
		{
			if(primeInput%i==0)
					count++;
		}
		
		//using while loop;
		
		/*while(i<=primeInput)
		{
			if(primeInput%i==0)
					count++;
			i++;
		}*/
		
		//using do while loop;
		
		/*do
		{

			if(primeInput%i==0)
					count++;
			i++;
		}while(i<=primeInput);
		*/
		
		
		if(count==2)
				System.out.println("given number is prime");
		else
				System.out.println("given number is not prime");

	}
	

}
