package learningjava;

public class PascalTriangle {

	PascalTriangle(String a)
	{
		System.out.println("true");
	}
	public static void main(String[] args) {
		PascalTriangle pt=new PascalTriangle("srujana");
		System.out.println(pt);
		String s1="srujana";
		String s2="srujana";
		String s3=new String("helllo");
		String s4=new String("helllo");
		if(s1.equals(s2))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(s3);
		/*for(int i=0;i<=5;i++)
		{
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			System.out.print((int)(Math.pow(11, i))+" ");
			System.out.println();
		}*/
	}

}
