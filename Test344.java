final class Test
{
	void m1()
	{
		System.out.println("im in method of parent class");
	}
}
class Test344 extends Test
{
	public static void main(String[]args)
	{
		Test344 t=new Test344();
		t.m1();
	}
}