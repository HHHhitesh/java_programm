import java.util.Scanner;
class Test84
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		/*
		boolean a single char byte double float int strig long short
		*/
		boolean b=sc.nextBoolean();
			System.out.println(b);
		char c=sc.next().charAt(0);
			System.out.println(c);
		double d=sc.nextDouble();
				System.out.println(d);
		byte e=sc.nextByte();
		System.out.println(e);
		float f=sc.nextFloat();
		System.out.println(f);
		int i=sc.nextInt();
			System.out.println(i);
			long l=sc.nextLong();
		System.out.println(l);
		short s=sc.nextShort();
		System.out.println(s);

		String S=sc.nextLine();//input a sentence
		System.out.println(S);

		 S=sc.next();//input only a word
		 System.out.println(S);
		

	}
}