//default

package p1;
class A
{
	void fun()
	{
		System.out.println("Hello");
	}
}

import p1.*;
package p2;
class Test162
{
	public static void main(String[]args)
	{
		A t=new A();
		t.fun();
	}
}