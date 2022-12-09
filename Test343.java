class Test
{
	final void m1()
	{
		System.out.println("im in class of parents.");
	}
}

class Test343 extends Test
{
	// void m1()
	// {
	// 	System.out.println("im in class of child.");
	// }
	public static void main(String[]args)
	{
		Test343 t=new Test343();
		t.m1();
	}
}