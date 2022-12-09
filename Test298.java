class Test298
{
	public static void main(String[]args)
	{
		Student s1=new Student();
	//	s1.CGPA=9.6f;
		s1.setCGPA(9.6f);
	//	System.out.println(s1.CGPA);
		System.out.println(s1.getCGPA());
	}
}
class Student
{
	String name;
	private float CGPA;
	//getter method
	public float getCGPA()
	{
		return CGPA;
	}
	//setter method
	public void setCGPA(float newCGPA)
	{
		this.CGPA=newCGPA;
	}
}