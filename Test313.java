//Type of aurgument
class Test313
{
	void show(int a)
	{
		System.out.println("1st");
	}

	void show(String b)
	{
		System.out.println("2nd");
	}

	public static void main(String[]args)
	{
		Test313 t=new Test313();
		t.show("hello");
		t.show(5);
	}
}