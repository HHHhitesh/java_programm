class Point
{
	int x,y;
	Point (int a,int b)
	{
		x=a;
		y=b;
	}
	void print()
	{
		System.out.println("x = "+x+", y = "+y);
	}
}
class Test140
{
	public static void main(String[]args)
	{
		Point p=new Point();
		p.print();

	}
}