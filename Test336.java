class Test
{
	Test(Test336 t)
	{
		System.out.println("TestClassConstructor:");
	}
}
class Test336
{
	void m1()
	{
		Test t=new Test(this);
	}
	public static void main(String[]args)
	{
		Test336 t=new Test336();
		t.m1();

	}
}