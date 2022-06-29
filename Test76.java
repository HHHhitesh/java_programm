import java.util.Scanner;
class Test76
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.print("Possitive ");
			if(n%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
		else if(n<0)
		{
			System.out.print("Negetive ");
			if(n%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
		else
			System.out.println("Zero");
	}
}