//Demo for encapsulation
class Student
{
	//fields
	String name;
	private float CGPA;
}

class Test296
{
	public static void main(String[]args)
	{
		Student s1=new Student();
		s1.CGPA=9.6f;
		System.out.println(s1.CGPA);
	}
}