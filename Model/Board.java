public class Board
{
	private Tile tiles[][];

	public Board(){tiles = new Tile[10][10];}

	public Tile getTile(int x, int y) // throws nonTile exception
	{
		if (x <= 9 && y <= 9)
			return tiles[x][y];
		else
		{
			throw new nonTileException("Tile does not exist");
		}
	}

	public bool getClickable(int x, int y){return tiles[x][y].isClickable();}
}

class nonTileException extends Exception
{
	public nonTileException(String s)
	{
		super(s);
	}
}
