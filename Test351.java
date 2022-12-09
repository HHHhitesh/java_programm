class Test351
{
	static int count=0;
	Test351()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[]args)
	{
		Test351 t1=new Test351();
		Test351 t2=new Test351();
	}
}