
class Test352 
{
	static void show()
	{
		System.out.println("2");
	}
	void display()
	{
		System.out.println("1");
	}

	public static void main(String[]args)
	{
		Test352 t=new Test352();
		t.display();
		show();
		Test352.show();
	}
}