class Point{int x,y;}
class Test118
{
	public static void main(String[]args)
	{
		Point p=new Point();
		p.x=10;
		p.y=20;
		fun(p);
		System.out.println(p.x+p.y);
	}
	public static void fun(Point p)
	{
		p.x=30;p.y=40;             
	}
}