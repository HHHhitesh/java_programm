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
class Test166 extends A
{
	public static void main(String[]args)
	{
		Test166 t=new Test166();
		t.fun();
	}
}