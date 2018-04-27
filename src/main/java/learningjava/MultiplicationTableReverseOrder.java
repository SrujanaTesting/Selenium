package learningjava;

public class MultiplicationTableReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tableNo=2;
		System.out.println("multiplication table of" +tableNo + " is ") ;
		for(int i=10;i>=1;i--)
		{
			
			System.out.println(i +" * " +tableNo +" = " +(i*tableNo));
		}

	}

}
