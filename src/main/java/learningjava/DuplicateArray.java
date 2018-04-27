package learningjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("enter x value");
		Scanner scan=new Scanner(System.in);
		x=scan.nextInt();
		int[] a =new int[x];
		System.out.println("enter aarray values");
		for(int i=0;i<x;i++)
		{
			a[i]=scan.nextInt();
		}
		/*Set<Integer> dupNum=new HashSet<Integer>();
		for(int i=0;i<x;i++)
		{
			for(int j=i+1;j<x;j++)
			{
				if(a[i]==a[j]) 
					dupNum.add(a[i]);
			}
		}
		System.out.println(dupNum);*/
		
		Arrays.sort(a);
		for(int i=0;i<x;i++)
			System.out.println(a[i]);
		if(a[0]==a[1])
			System.out.println(a[0]+"is a duplicate one");
		for(int i=1;i<x-1;i++)
		{
			if(a[i]==a[i+1]&&a[i]!=a[i-1])
				System.out.println(a[i]+"is a duplicate number");
		}
	}

}
