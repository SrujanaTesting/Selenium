package learningjava;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Get input number and store it in available
		int inputNumber=576;
		int number=inputNumber;
		//2.Initialise sumOfDigits
		int sumOfDigits=0,reminder;
		//3.Get each digit using whileloop and calculate sum
		while(inputNumber!=0)
		{
			reminder=inputNumber%10;
			sumOfDigits=sumOfDigits+reminder;
			inputNumber=inputNumber/10;
		}
		//4.print the sumOfdigits
		System.out.println("Sum of digits of" +number +"is" +sumOfDigits);
		

	}

}
