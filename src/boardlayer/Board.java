package boardlayer;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) 
	{
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() 
	{
		return rows;
	}

	public int getColumns() 
	{
		return columns;
	}
	
	public Piece piece(int row, int column) 
	{
		return piece(new Position(row, column));
	}
	
	public Piece piece(Position position) 
	{
		if (pieces == null) return null;
		int row = position.getRow();
		int column = position.getColumn();
		return pieces[row][column];
	}
	
	public void placePiece(Piece piece, Position position) 
	{
		int row = position.getRow();
		int column = position.getColumn();
		pieces[row][column] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) 
	{
		return null;
	}
	
	public boolean PositionExists(Position position) 
	{
		return false;
	}
	
}
