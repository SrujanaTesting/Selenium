package learningjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class ExceptionsLearn {

	
	/*There are two types of Exceptions.Checked and Unchecked Exceptions
	 *checked Exceptions are handled during compile time and it gives the compilation error if it is not caught and handled during compile time
	 Ex;FileNotFoundExceptio,IO Exception
	 *Unchecked Exceptions are not mandatory to handle at compile time.The compiler ignores during compile time.
	 *Ex:ArrayOutOfBoundException
	 *When we dont handle the exception the execution of the program will be stopped when JVM finds an exception in the program and will not go to the other lines of the program for execution.
	 *When we handle the Exception whenever JVM finds an exception in the program it handles there and continues to execute other lines of the program.
	 *we can use try catch finally blocks at a time in the program but try block with any of other blocks are must.
	 *Instead of handling the exception when we throw the exception using throws keyword exception will be handled but the execution gets stopped wthout executing further statements.
	 *So always its better to handle exceptions using try/catch/finally blocks rather than using throws keyword to undisturb the other statements of the program.
	 *All checked exceptions are handled using throws keyword but its not mandatory we can even handle it via try/catch/finally blocks
	 *Differences Between Error and Exception
	 *An error is caused due to lack of system resources		An Exceptions is caused because of code
	 *An Exception is irrecoverable 							An Exception is recoverable
	 *There is no means to handle an error by the program code	As an exceptionis detected it is thrown and caught by the thro and catch keywords correspondingly
	 *
	 */
	public static void main(String[] args) 
	{
		File src=new File("./files/report.png");
		File dest=new File("./files/report.png");

			try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*int[] a= {1,2};
			System.out.println(a[2]);
			System.out.println(a[1]);
			
			
*/		
			System.out.println("Iam tall");
		

	}

}
