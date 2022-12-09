class Test333
{
	void display()
	{
		System.out.println("Hello");
	}
	void show()
	{
		// display(); 
		this.display();
	}

	public static void main(String[]args)
	{
		Test333 t=new Test333();
		t.show();
	}
}