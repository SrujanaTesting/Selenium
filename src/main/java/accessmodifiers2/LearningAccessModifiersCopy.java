package accessmodifiers2;

import accessmodifiers1.LearningAccessModifiers2;

public class LearningAccessModifiersCopy extends LearningAccessModifiers2 {
	
	
	public static void main(String args[])
	{
		LearningAccessModifiersCopy lamc=new LearningAccessModifiersCopy();
		lamc.idPrint();
		lamc.taxprint();
		
		System.out.println(salarayPrint());
		System.out.println(lamc.inhertVariable);
	}
	
	public void idPrint()
	
	{
		System.out.println("Iam a good girl");System.out.println(2+4);
		System.out.println("854972");
	}

	protected void taxprint()
	{
		System.out.println("9.0%");
	}
	
	public static int salaarayPrint()
	{
		return 5;
	}
	
		
}
