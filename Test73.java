import java.util.Scanner;
class Test73
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("You entered an EVEN number");
		else
			System.out.println("You entered an ODD number");

	}
}