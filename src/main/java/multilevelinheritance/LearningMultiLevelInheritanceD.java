package multilevelinheritance;

public class LearningMultiLevelInheritanceD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class C
		System.out.println(LearningMultiLevelInheritanceC.variableA);
		System.out.println(LearningMultiLevelInheritanceC.variableB);
		System.out.println(LearningMultiLevelInheritanceC.variableC);
		LearningMultiLevelInheritanceC.methodA();
		LearningMultiLevelInheritanceC.methodB();
		System.out.println(LearningMultiLevelInheritanceC.methodC());
		//class B
		LearningMultiLevelInheritanceB.methodA();
		LearningMultiLevelInheritanceB.methodB();
		System.out.println(LearningMultiLevelInheritanceB.variableA);
		System.out.println(LearningMultiLevelInheritanceB.variableB);
		//class A
		LearningMultiLevelInheritanceA.methodA();
		System.out.println(LearningMultiLevelInheritanceA.variableA);
	}

}
