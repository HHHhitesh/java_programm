class Test65
{
	public static void main(String[]args)
	{
		int x=10,y=5,z;
		x+=y;
		System.out.println(x);//15
		x%=y;
		System.out.println(x);//0
		z=x=y;//right to left
		System.out.println(z);
	}
}