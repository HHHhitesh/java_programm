import java.util.Scanner;
class Complex
{
	int real,imag;
	void print()
	{
		System.out.println(real+ " +i"+imag);
	}
	Complex (int r,int i)
	{
		real=r;
		imag=i;
	}
	void add(Complex c)
	{
		real=real+c.real;
		imag=imag+c.imag;

	}
}
class Test129
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt(),i=sc.nextInt();
		Complex c1=new Complex(r,i);
		c1.print();
		Complex c2=new Complex(r,i);
		c1.add(c2);
		c1.print();

	}
}