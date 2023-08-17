package boardlayer;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) 
	{
		this.position = null;
		this.board = board;
	}
	
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) 
	{
		int row = position.getRow();
		int column = position.getColumn();
		return possibleMoves()[row][column];
	}
	
	public boolean isThereAnyPossibleMove() 
	{
		return possibleMoves().length > 0;
	}

	protected Board getBoard() {
		return board;
	}

}
