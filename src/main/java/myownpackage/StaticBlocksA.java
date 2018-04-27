package myownpackage;

public class StaticBlocksA {

	static 
	{
	System.out.println("Static block A");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("StaticBlocksB");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Class.forName("StaticBlocksC");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class StaticBlocksB 
{
	static
	{
		System.out.println("Static block b");
	
	}
}
class StaticBlocksC  
{
	static
	{
		System.out.println("Static Block C");
	}
}
