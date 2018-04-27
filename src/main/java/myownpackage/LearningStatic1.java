package myownpackage;

class LearningStatic1 {
	static int y=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we cannot access the other class static fields here directly.when we extends te other class it is possible. 
		System.out.println(y +" " +LearningStatic.x);
	}

}
