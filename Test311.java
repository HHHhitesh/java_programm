//different no of aurgument
class Test311
{
	void show(int a)
	{
		System.out.println("1");
	}

	void show(int a,int b)
	{
		System.out.println("2");
	}

	public static void main(String[]args)
	{
		Test311 t=new Test311();
		t.show(2,5);
	}
}