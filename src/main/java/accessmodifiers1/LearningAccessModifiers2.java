package accessmodifiers1;

public class LearningAccessModifiers2 {

	protected int inhertVariable=10;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int empId;
		String companyName;
		double salary;
		float tax;
		LearningAccessModifiers1 lam = new LearningAccessModifiers1();
		System.out.println(lam.age);
		System.out.println(lam.name);
		System.out.println(lam.sex);
		lam.agePrint();
		lam.namePrint();
		lam.sexPrint();
		System.out.println(salarayPrint());
		LearningAccessModifiers2 lam2=new LearningAccessModifiers2();
		lam2.idPrint();
		
	}
	
	public void idPrint()
	
	{
		System.out.println("854572");
	}
	

	public static int salarayPrint()
	{
		return 50000000;
	}
	

	private void companyNamePrint() 
	{
		System.out.println("TCS");
	}
	
	protected void taxprint()
	{
		System.out.println("7.5%");
	}
}
