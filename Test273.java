import java.util.Arrays;
class Test273
{
	public static void main(String[]args)
	{
		int arr1[]={1,2,3};
		int arr2[]={1,2,3};
		// if(arr1==arr2)
		// if(arr1.equals(arr2))
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
}