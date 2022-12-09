public class Test215
{
	public static void main(String[]args)
	{
		try
		{
			methodA();
			System.out.println("Exit main()");
		}

		catch(ArithmeticException ex)
		{
			System.out.println("Arithmetic exception caught ...");

			// ex.printStackTrace();
		}
		
	}
	public static void methodA()
	{
		System.out.println("Enter Method A() :");
		int a=5,b=0;
		int c=a/b;
		System.out.println(c);
	}
}