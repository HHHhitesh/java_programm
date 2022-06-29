import java.util.Scanner;
class Test68
{
	public static void main(String[]args)
	{
		String usr="geek",pwd="keeg";
		Scanner sc=new Scanner(System.in);
		String ui=sc.next();
		String up=sc.next();
		if(usr.equals(ui)&&pwd.equals(up))
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Try Again!");
		}
	}
}