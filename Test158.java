//member method

class Player
{
	String name;
	int id;
	private static int playerCount=0;
	
	//constructor
	Player(String name)
	{
		this.name=name;
		id=++playerCount;
	}

	static int getPlayerCount()
	{
		return playerCount;
	}
}

class Test158
{
	public static void main(String[]args)
	{
		System.out.println(Player.getPlayerCount());
		Player p1=new Player("abc");
		System.out.println(Player.getPlayerCount());
	}
}
