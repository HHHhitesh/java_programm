package p1;
public class A
{
	protected void fun()
	{
		System.out.println("hello");
	}
}

import package p1.*;
package p2;
class  Test167
{
	public static void main(String[]args)
	{
		A t=new A();
		t.fun();
	}
}