package myownpackage;

public class StringArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(args[0]);//ram
		args[0]="fruit";//overriding the value that is configured already in arguments
		System.out.println(args[0]);//fruit
		
	}

}
