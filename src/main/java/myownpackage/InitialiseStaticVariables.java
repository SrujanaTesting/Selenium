package myownpackage;

public class InitialiseStaticVariables {
	
	static int eid;
	static
	{
		InitialiseStaticVariables.eid=10;
	}
	static void disp()
	{
		System.out.println(InitialiseStaticVariables.eid);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InitialiseStaticVariables.disp();
	}

}
