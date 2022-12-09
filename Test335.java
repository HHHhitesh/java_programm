class Test335
{
	void m1(Test335 t)
	{
		System.out.println("im printing m1 method");
	}
	void m2()
	{
		m1(this);
	}

	public static void main(String[]args)
	{
		Test335 t=new Test335();
		t.m2();
	}
} 