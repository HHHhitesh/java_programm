import java.util.Scanner;
class Test261
{
	static int binarySearch(int arr[],int l,int r,int x)
	{
		if(r>=1)
		{
			int mid =(l+(r-1))/2;

			if(arr[mid]==x)
				return mid;
			if(arr[mid]>x)
				return binarySearch(arr,l,mid-1,x);
			return binarySearch(arr,mid+1,r,x);
		}
		return -1;

	}

	public static void main(String[]args)
	{
		// int arr[]={10,50,30,70,80,60,2cd 0,90,40};
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
		int result=binarySearch(arr,0,a-1,x);
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