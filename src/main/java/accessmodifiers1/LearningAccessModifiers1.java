package accessmodifiers1;

public class LearningAccessModifiers1 {
	
	public String name="srujana";
	int age=24;
	private float mark=88.9f;
	protected char sex='F';
	
	public void namePrint()
	{
		System.out.println("name is Srujana");
	}
	
	int agePrint()
	{
		return 24;
	}
	
	private void marksPrint()
	{
		System.out.println("marks are 88");
	}
	
	protected void sexPrint()
	{
		System.out.println("sex is F");;
	}

}
