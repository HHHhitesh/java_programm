class Test349
{
	int empId;
	String empName;
	static String company="SP";

	Test349(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}

	void display()
	{
		System.out.println(empId+" "+empName+" "+company);
	}

	public static void main(String[]args)
	{
		Test349 t1=new Test349(101,"Ankur");
		t1.display();
		Test349 t2=new Test349(102,"Bhavesh");
		t2.display();
	}
}