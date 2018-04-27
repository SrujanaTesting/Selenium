package myownpackage;

public class StaticBlock {
	//instance block which is executed when object is created
	
	{
		System.out.println("srujana");
	}
	
	static //first block that is executed during class file loading after this only main method starts executes
	{
		System.out.println(2+4);
	}
	//constructor executed after instance block execution when object is created
	StaticBlock()
	{
		System.out.println("Inside a constructor");
	}
	StaticBlock(int a)
	{
		System.out.println(a);
		
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		new StaticBlock();
		new StaticBlock(10);
		
		
	}*/

}


/*output:
	6(static block)
	srujana
	Inside a constructor
	srujana
	10*/