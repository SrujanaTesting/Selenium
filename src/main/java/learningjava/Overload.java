package learningjava;

public class Overload {
	public int a;
	public static int b;
	final void add()
	{
		System.out.println("hello");
	}
	
	void add(int a)
	{
		System.out.println("hello1");
	}
	
	public static void main(String[] args)
	{
		Overload ol=new Overload();
		ol.a=20;
		ol.b=30;
		System.out.println(ol.a+"  "+ol.b);
		Overload ol1=new Overload();

		System.out.println(ol1.a+"  "+ol1.b);
		

	}

}
