interface I1
{
	void show();
}
interface I2
{
	void display();
}
class Test326 implements I1,I2
{
	public void show()
	{
		System.out.println("1");
	}
	public void display()
	{
		System.out.println("2");
	}
	public static void main(String[]args)
	{
		Test326 t=new Test326();
		t.show();
		t.display();
	}
}