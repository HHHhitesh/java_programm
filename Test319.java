// Define Test319 Vehical;
abstract class Test319//Vehical
{
	abstract void start();
}

class Car extends Test319
{
	void start()
	{
		System.out.println("Starts with key: ");
	}
}

class Bike extends Test319
{
	void start()
	{
		System.out.println("Starts with kick: ");
	}
	public static void main(String[]args)
	{
		Bike b=new Bike();
		b.start();
		Car c=new Car();
		c.start();
	}
}