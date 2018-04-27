package learningjava;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNum,endNum,reminder;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter starting and ending range");
		startNum=scan.nextInt();
		endNum=scan.nextInt();
		for(int i=startNum;i<=endNum;i++)
		{
			
			int j=i,sumOfCubes=0;
			while(j>0) 
			{
				reminder=j%10;
				sumOfCubes=sumOfCubes+(reminder*reminder*reminder);
				j=j/10;
			}
			if(sumOfCubes==i)
				System.out.println(i+"  is an amstrong number");
		}
	}

}
