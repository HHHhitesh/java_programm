interface I1
{
	void show();
}
class Test325 implements I1
{
	public void show()
	{
		System.out.println("1");
	}
	public static void main(String[]args)
	{
		Test325 t=new Test325();
		t.show();
	}
}
