class Test334
{
	Test334()
	{
		System.out.println("no args constructor.");
	}
	Test334(int i)
	{
		this();
		System.out.println("parameterised constructor.");
	}

	public static void main(String[]args)
	{
		// Test334 t=new Test334();
		Test334 t=new Test334(100);
	}
}