import java.util.Scanner;
class Test116
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  two INTEGER NUMBER");
		int x,y;
		System.out.print("Your First Number is: ");
		x=sc.nextInt();
		System.out.print("Your Second Number is: ");
		y=sc.nextInt();
		System.out.print("MAX is: ");
		System.out.println(getMax(x,y));
	}
	public static int getMax(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
}