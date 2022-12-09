class Point
{
	int x,y;
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	Point setX(int x)
	{
		this.x=x;
		return this;
	}

	Point setY(int y)
	{
		this.y=y;
		return this;
	}
}
class Test149
{
	public static void main(String[]args)
	{
		Point p1=new Point(10,20);
		Point p2=new Point(5,15);
		p1.setX(2).setY(3);
	
	}
}