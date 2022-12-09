class Player
{
	String name;
	int id;
	static int playerCount=0;
	Player(String name)
	{
		this.name=name;
		id=++playerCount;
	}
	void printDetails()
	{
		System.out.println(id+" : "+name);
	}
}
class Test154
{
	public static void main(String[]args)
	{
		Player p1=new Player("xyz");
		Player p2=new Player("abc");
		System.out.println(Player.playerCount);
		System.out.println(p1.playerCount);
	}
}