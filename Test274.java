class Test274
{
	public static void main(String[]args)
	{
		int[] x={10,20,30,40};
		int[] y=x;
		x=new int[3];
		for(int i=0;i<x.length;i++)
		{
			System.out.print(y[i]+" ");
		}
	}
}