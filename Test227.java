import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test227
{
	public static void main(String[]args)
	{
		try
		{
			methodA();
			Scanner in =new Scanner(new File("test.in"));
			System.out.println("Exit main");
		}

		catch(ArithmeticException ex)
		{
			System.out.println("ArithmeticException caught ...");
		}

		catch(FileNotFoundException ex)
		{
			System.out.println("File not found caught ... ");
		}

		catch(Exception ex)
		{
			System.out.println("A new tpe of exception has occurred ");
		}

		finally
		{
			System.out.println("finally runs regardless of the state of exception ");
		}

	}

	public static void methodA()
	{
		System.out.println("Enterr method A ");
		try
		{
			int a=5,b=0;
			int c=a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("finally in method A()");
		}
	}
}
