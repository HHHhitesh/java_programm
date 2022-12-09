import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Test210
{
	public static void main(String[]args)
	{
		try
		{
			Scanner in=new Scanner(new File("test.in"));

			System.out.println("Exit main()");
		}

		catch (FileNotFoundException ex)
		{
			System.out.println("File Not Found caught ...");

		}

		finally
		{
			System.out.println("finally-block runs regardless of the state of exception");
		}

		System.out.println("After try-catch-finally , life goes on...");
	}
}