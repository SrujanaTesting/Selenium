package learningjava;

import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		String text;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the text");
		text=scan.nextLine();
		char[] ch=new char[text.length()];

		for(int i=0;i<text.length();i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]==text.charAt(i))
				{
					count++;
					break;
				}
				
			}
			if(count>0)
				continue;
			else if(text.charAt(i)==' ')
				continue;
			else {
				ch[i]=text.charAt(i);
				System.out.print(ch[i]);
			}
		}
		
	}

	}


