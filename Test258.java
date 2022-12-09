import java.util.Scanner;
class Test258
{
	public static int search(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
				return i;
		}
		return -1;
	}

/*	public static void input()
	{
		Scanner sc=new Scanner(System.in);
		//array length
		System.out.println("array length is: ");
		int a=sc.nextInt();
		//array is here
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter value of "+i+ " items");
			arr[i]=sc.nextInt();
		}


		System.out.println("enter Search number: ");
		x=sc.nextInt();
		int sc.nextInt();

		search(arr,x);
	}
*/
	public static void main(String[]args)
	{
		// int arr[]={10,50,30,70,80,60,20,90,40};
		Scanner sc=new Scanner(System.in);
		//array length
		System.out.print("array length is: ");
		int a=sc.nextInt();
		//array is here
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter value of "+(i+1)+ " items: ");
			arr[i]=sc.nextInt();
		}

		System.out.println("finding: is ");
		int x=sc.nextInt();
		int result=search(arr,x);
		if(result==-1)
		{
			System.out.println("Element is not present is array.");
		}
		else
		{
			System.out.println("Element is present at index "+(result+1));
		}

	}
}