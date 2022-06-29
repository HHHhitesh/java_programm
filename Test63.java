class Test63
{
	public static void main(String[]args)
	{
		int x=10,y=20,z;
		System.out.println(x+y);
		System.out.println(x*y);
		System.out.println(y/x);
		z=(x+(y*10));
		System.out.println(z);
		z=x++;
		System.out.println(z+" "+x);
		z=++x;
		System.out.println(z+" "+x);
	}
}