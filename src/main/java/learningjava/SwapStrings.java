package learningjava;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {

		String string1,string2;
		System.out.println("enter sstring 1 and string 2");
		Scanner scan=new Scanner(System.in);
		string1=scan.nextLine();
		string2=scan.nextLine();
		int length=string1.length();
		System.out.println("string1:"+string1+"string2"+string2);
		string1=string1.concat(string2);
		string2=string1.substring(0,length);
		string1=string1.substring(length,string1.length());
		System.out.println("string1"+string1+"string2"+string2);
		
		
	}

}
