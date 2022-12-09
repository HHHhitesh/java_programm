// Method overriding
class XYZ
{
	void show()
	{
		System.out.println("1");
	}
}
class Test314 extends XYZ
{
	void show()
	{
		System.out.println("2");
	}
	public static void main(String[]args)
	{
		// Test314 t=new Test314();//2
		// XYZ t=new XYZ();//1
		// Test314 t=new XYZ(); error
		// XYZ t=new Test314();//2
		t.show();
	}
}