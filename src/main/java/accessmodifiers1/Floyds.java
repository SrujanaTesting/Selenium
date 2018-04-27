package accessmodifiers1;
public class Floyds {

	/*public static void main(String[] args) {

		int n=5;
		int temp=n;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<temp;j++)
			{
				System.out.print(" ");
			}
			temp=temp-1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
	}

}
*/
public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k +" ");
            }
            System.out.println();
        }
}
}
