package learningjava;

import java.util.Scanner;

public class LearningArrays {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[][] nameBloodGroup ={{"name","BloodGroup"},{"srujana","Bpositive"},{"srilakshmi","Onegative"},{"Annapurnamma","Bnegative"},{"saibaba","Opositive"}};
		/*for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=1;j++)
			{
				if(j==0)
				{//System.out.println(nameBloodGroup[i][j] +"   " +nameBloodGroup[i][j+1]);
					System.out.println();
					System.out.print(nameBloodGroup[i][j]+"    ");
					System.out.print(nameBloodGroup[i][j+1]);
				}
			}
		}*/
			/*for(int i=0;i<=4;i++)
			{
				System.out.println(nameBloodGroup[i][0] + "   " +nameBloodGroup[i][1]);
			}*/
			
			for(String[] nbg:nameBloodGroup)
			{
				for(String nbg1:nbg)
				{
					//System.out.println(nbg);
					System.out.println(nbg1);
				}
			}
			
			Scanner scan=new Scanner(System.in)
;			
			int twoDimArray[][] =new int[3][4];
			System.out.println("Enter array elements");
			/*for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
				{
					twoDimArray[i][j]=scan.nextInt();
				}
			}
		
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
				{	
					
					System.out.print(twoDimArray[i][j] + "   " );
					
				}
				System.out.println("");
			}*/
			
			for(int[] i:twoDimArray)
			{
				for(int j:i)
				{
					j=scan.nextInt();
				}
			}
			
					
			/*for(int[] i:twoDimArray)
			{
				for(int j:i)
					System.out.println(j);
				
			}*/

	}
	

}
