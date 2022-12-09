public class Test217
{
	public static void main(String[]args)
	{
		try
		{
			methodA();
			System.out.println("Exit methodA() ");
		}

		catch(ArithmeticException ex)
		{
			System.out.println("ArithmeticException caught ... ");
			ex.printStackTrace();
		}

		finally
		{
			System.out.println("finally block runs regardless of the state of exceptions");
			System.out.println("After-try-catch-finally, life goes on...");
		}
	}

		public static void methodA()
		{
			System.out.println("Enter methodA()");
			try
			{
				int a=5,b=0;
				int c=a/b;
				System.out.println(c);
			}

			finally
			{
				System.out.println("finally is methodA() ");
			}
			System.out.println("Exit method()");
		}
	}
