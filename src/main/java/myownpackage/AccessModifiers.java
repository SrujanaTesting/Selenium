package myownpackage;

class AccessModifiers 
{
	
	private int a=10;
	int b=20;
	protected int c=30;
	
	private int method()
	{
		System.out.println(10);
		return 3;
	}
	
	public static void main(String args[])
	{
		//Am am= new Am();
		
	}

	 class Am 
	{		
		
		private void methoda()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(method());
		
		}
		
	}
	
	

}
