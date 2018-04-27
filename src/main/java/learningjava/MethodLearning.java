package learningjava;

public class MethodLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=add(3,4);
		
		System.out.println("Addition of two numbers is"+sum);
		int sub=subtraction(10,20);
		System.out.println("subtraction of two numbers is"+sub);
		int mul=multiplication(3,4);
		System.out.println("multiplication of two numbers is"+mul);
		int div=division(10,20);
		System.out.println("division of two numbers is"+div);
		int mod=modulus(5,4);
		System.out.println("modulo of two numbers is"+mod);
	}
	public static int add(int num1,int num2)
	{
		return num1+num2;
	}

		
		public static int subtraction(int num1,int num2)
		{
			return num1-num2;
		}
		public static int multiplication(int num1,int num2)
		{
			return num1*num2;
		}
		public static int division(int num1,int num2)
		{
			return num1/num2;
		}
		public static int modulus(int num1,int num2)
		{
			return num1%num2;
		}
		
		
}
