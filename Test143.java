class Point
{
	int x,y;
	Point(int a,int b)
	{	
		x=a;
		y=b;
	}
	void print()
	{
		System.out.println("x = "+x+", y = "+y);
	}
}
class Test143
{
	public static void main(String[]args)
	{
		Point p1=new Point(10,20);
		Point p2=new Point(5,15);
	}
}