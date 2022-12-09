package p1;
public class A
{
	public void fun()
	{
	System.out.println("Hello");
	}
}
import p1.*;
package p2;
class Test168
{
	public static void main(String[]args)
	{
		A t=new A();
		t.fun();
	}
}