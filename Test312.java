//sequence of aurgument
class Test312
{
	void show(int a,String b)
	{
		System.out.println("1");
	}

	void show(String b,int a)
	{
		System.out.println("2");
	}

	public static void main(String[]args)
	{
		Test312 t=new Test312();
		t.show("hello",5);
		t.show(5,"hello");
	}
}