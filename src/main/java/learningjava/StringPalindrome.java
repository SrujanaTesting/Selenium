package learningjava;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using character array
		/*String inputString;
		System.out.println("enter input string");
		Scanner scan =new Scanner(System.in);
		inputString=scan.next();
		char[] charArray = inputString.toCharArray();
		char[] charArray1 = new char[charArray.length];
		for(int i=0,j=charArray.length-1;i<charArray.length&&j>=0;i++,j--)
		{
			charArray1[i]=charArray[j];
			System.out.println(charArray1[i]);
		}
		//String reverseString = charArray1.toString();is not working?
		String reverseString = new String(charArray1);
		System.out.println(reverseString);
		if(reverseString.equals(inputString))
				System.out.println("given string is palindrome");
		else
				System.out.println("not a plaindrome");
		*/
		/*Scanner scan =new Scanner(System.in);
		String originalString,reverseString1="";
		System.out.println("enter original string");
		originalString=scan.next();
		for(int i=originalString.length()-1;i>=0;i--)
		{
			reverseString1=reverseString1+originalString.charAt(i);
		}
		System.out.println(reverseString1);
		if(reverseString1.equals(originalString))
				System.out.println("given string is plaindrome");
		else
				System.out.println("given string not a palindrome");*/
		
		//without using char array and extra string to store reverse value
		String originalString1;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter originalString value");
		originalString1=scan.next();
		int begin=0,end=originalString1.length()-1,mid=(begin+end)/2,i;
		for(i=begin;i<mid;i++)
		{
			if(originalString1.charAt(begin)==originalString1.charAt(end))
			{
				begin++;
				end--;
			}
			else
				break;
		}
		
		if(i==mid)
		
			System.out.println("it is a palindrome");
		
		else
				System.out.println("not  palindrome");
	}

}
