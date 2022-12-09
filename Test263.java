class Test263
{
	void bubbleSort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}

	void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		
	}
	public static void main(String[]args)
	{
		Test263 t=new Test263();
		int arr[]={99,88,77,44,55,66};
		t.printArray(arr);
		t.bubbleSort(arr);
		t.printArray(arr);

	}
}