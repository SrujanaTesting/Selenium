package learningjava;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=10,number2=20;
		boolean booleanValue1=(number1==10&&number1<number2);
		System.out.println(booleanValue1);
		boolean booleanValue2=(number1==8&&number1<number2);
		System.out.println(booleanValue2);
		boolean booleanValue3=(number1==10||number1<number2);
		System.out.println(booleanValue3);
		boolean booleanValue4=(number1==8||number1<number2);
		System.out.println(booleanValue4);
		boolean booleanValue5=!(number1==8&&number1<number2);
		System.out.println(booleanValue5);
	}

}
