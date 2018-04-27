package learningjava;

import java.util.Scanner;

public class PercentageCal {

	public static void main(String[] args) {
		
		String text;
		double upperCaseCount=0,lowerCaseCount=0,digitCount=0,otherCount=0;
		System.out.println("enter the text");
		Scanner scan=new Scanner(System.in);
		text=scan.nextLine();
		for(int i=0;i<text.length();i++)
		{
			if((text.charAt(i)>='A')&&(text.charAt(i)<='Z'))
				upperCaseCount++;
			else if((text.charAt(i)>='a')&&(text.charAt(i)<='z'))
				lowerCaseCount++;
			else if((text.charAt(i)>='0')&&(text.charAt(i)<='9'))
				digitCount++;
			else
				otherCount++;
		}
		
		System.out.println(text.length()+"   "+upperCaseCount+"   "+lowerCaseCount+"    "+digitCount+"   "+otherCount);
		System.out.println((upperCaseCount*100)/(text.length()));
		System.out.println(lowerCaseCount*100/text.length());
		System.out.println(digitCount*100/text.length());
		System.out.println(otherCount*100/text.length());


	}

}
