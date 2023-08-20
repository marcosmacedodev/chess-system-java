package chesslayer.pieces;

import boardlayer.Board;
import boardlayer.Position;
import chesslayer.ChessMatch;
import chesslayer.ChessPiece;
import chesslayer.Color;

public class King extends ChessPiece {
	
	private ChessMatch chessMatch;

	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		// TODO Auto-generated constructor stub
		this.chessMatch = chessMatch;
	}
	
	@Override
	public String toString() 
	{
		return "K";
	}
	
	private boolean testRookCastling(Position position) {
		ChessPiece piece = (ChessPiece) getBoard().piece(position);
		return piece != null && piece instanceof Rook && piece.getColor() == getColor() && piece.getMoveCount() == 0;
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		Position posRook;
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		//Above
		Position p = new Position(0, 0);
		p.setValues(position.getRow() - 1, position.getColumn());
		if(getBoard().positionExists(p) && canMove(p))
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//Below
		p.setValues(position.getRow() + 1, position.getColumn());
		if(getBoard().positionExists(p) && canMove(p))
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//Left
		p.setValues(position.getRow(), position.getColumn() - 1);
		if(getBoard().positionExists(p) && canMove(p))
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//Right
		p.setValues(position.getRow(), position.getColumn() + 1);
		if(getBoard().positionExists(p) && canMove(p))
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//Nw
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if(getBoard().positionExists(p) && canMove(p))
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//Ne
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if(getBoard().positionExists(p) && canMove(p))
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//Sw
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if(getBoard().positionExists(p) && canMove(p))
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		//Se
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if(getBoard().positionExists(p) && canMove(p))
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		//castling
		if(getMoveCount() == 0 && !chessMatch.getCheck()) {
			
			posRook = new Position(position.getRow(), position.getColumn() + 3);
			if(testRookCastling(posRook)) {
				Position p1 = new Position(position.getRow(), position.getColumn() + 1);
				Position p2 = new Position(position.getRow(), position.getColumn() + 2);
				if(getBoard().piece(p1) == null && getBoard().piece(p2) == null) {
					possibleMoves[position.getRow()][position.getColumn() + 2] = true;
				}
			}
			
			posRook = new Position(position.getRow(), position.getColumn() - 4);
			if(testRookCastling(posRook)) {
				Position p1 = new Position(position.getRow(), position.getColumn() - 1);
				Position p2 = new Position(position.getRow(), position.getColumn() - 2);
				Position p3 = new Position(position.getRow(), position.getColumn() - 3);
				if(getBoard().piece(p1) == null && getBoard().piece(p2) == null && getBoard().piece(p3) == null) {
					possibleMoves[position.getRow()][position.getColumn() - 2] = true;
				}
			}
			
		}
		
		return possibleMoves;
	}
	
	private boolean canMove(Position position) {
		ChessPiece piece = (ChessPiece)getBoard().piece(position);
		return piece == null || piece.getColor() != getColor();
	}

}
