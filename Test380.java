class Test380
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
			System.out.println("you can not devide by zero");
		}
		System.out.println("hello");

		
	}
}