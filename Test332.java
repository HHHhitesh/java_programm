class Test332
{
	int i;
	void setValue(int i)
	{
		this.i=i;
	}
	void show()
	{
		System.out.println(i);
	}

	public static void main(String[]args)
	{
		Test332 t=new Test332();
		t.setValue(100);
		t.show();
	}
}