class Test383
{
	public static void main(String[]args)
	{
		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			// e.printStackTrace();
			// System.out.println(e);
			// System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
			finally
		{
			System.out.println("im in finally block");
		}
	}
}