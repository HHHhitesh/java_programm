class Test348
{
	int empId;
	String empName;
	String company;

	Test348(int empId,String empName , String company)
	{
		this.empId=empId;
		this.empName=empName;
		this.company=company;
	}

	void display()
	{
		System.out.println(empId+" "+empName+" "+company);
	}

	public static void main(String[]args)
	{
		Test348 t1=new Test348(101,"Ankur","SP");
		t1.display();
		Test348 t2=new Test348(102,"Bhavesh","SP");
		t2.display();
	}
}