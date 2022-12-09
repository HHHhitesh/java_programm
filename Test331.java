class Test
{
	//1.using x
	// int i;
	// void setValue(int x)
	// {
	// 	i=x;
	// }
	// void show()
	// {
	// 	System.out.println(i);
	// }

	// //2.using with out x
	// int i;
	// void setValue(int i)
	// {
	// 	i=i;
	// }
	// void show()
	// {
	// 	System.out.println(i);
	// }

	//3. Using this keyword
	int i;
	void setValue(int i)
	{
		this.i=i;
	}
	void show()
	{
		System.out.println(i);
	}
}
class Test331
{
	public static void main(String[]args)
	{
		Test t=new Test();
		t.setValue(10);
		t.show();
	}
}