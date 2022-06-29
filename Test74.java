import java.util.Scanner;
class Test74
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid number");
		}
	
			System.out.println(n*(n+1)/2);
	}
}