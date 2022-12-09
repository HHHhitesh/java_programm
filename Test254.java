import java.util.Scanner;
class Test254
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" m = ");
		int m=sc.nextInt();
		System.out.print(" n = ");
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		int arrr[]=new int[m*n]; 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				{
					System.out.print("Enter value of arr["+i+"]"+"["+j+"] = ");
					arr[i][j]=sc.nextInt();
				}
				
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				{
					System.out.print(arr[i][j]+" ");
				}
				
			}
		}

	}
}