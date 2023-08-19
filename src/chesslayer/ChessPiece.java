package chesslayer;

import boardlayer.Board;
import boardlayer.Piece;
import boardlayer.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) 
	{
		super(board);
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	public Color getColor() 
	{
		return color;
	}
	
	public int getMoveCount()
	{
		return moveCount;
	}
	
	
	public void increaseMoveCount() 
	{
		moveCount++;
	}
	
	public void decreaseMoveCount() 
	{
		moveCount--;
	}
	
	protected boolean isThereOpponentPiece(Position position) 
	{
		ChessPiece piece = (ChessPiece)getBoard().piece(position);
		return piece != null && piece.getColor() != color;
	}
	
	public ChessPosition getChessPosition() 
	{
		return ChessPosition.fromPosition(position);
	}

}
