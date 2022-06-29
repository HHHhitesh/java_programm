import java.util.Scanner;
class Test79
{
	public static void main(String[]args)
	{
		int x=0,y=0;
		System.out.println("Enter a move :");
		Scanner sc=new Scanner(System.in);
		char move=sc.next().charAt(0);
		switch(move)
		{
		case 'L':
			x--;
			break;
		case 'R':
			x++;
			break;
		case 'U':
			y++;
			break;
		case 'D':
			y--;
			break;
		default :
			System.out.println("Invalid");
		}

	}
}