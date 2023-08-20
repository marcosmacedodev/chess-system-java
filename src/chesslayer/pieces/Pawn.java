package chesslayer.pieces;

import boardlayer.Board;
import boardlayer.Position;
import chesslayer.ChessMatch;
import chesslayer.ChessPiece;
import chesslayer.Color;

public class Pawn extends ChessPiece {

	private ChessMatch chessMatch;
	
	public Pawn(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		// TODO Auto-generated constructor stub
		this.chessMatch = chessMatch;
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		boolean isValidMove, isWhite;
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		isWhite = getColor() == Color.WHITE;
		
		p.setValues(position.getRow() + (isWhite? -1: +1) , position.getColumn());
		isValidMove = getBoard().positionExists(p) && !getBoard().thereIsAPiece(p);
		if(isValidMove)
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow() + (isWhite? -2: +2), position.getColumn());
		isValidMove = isValidMove && getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount() == 0;
		if(isValidMove)
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow() + (isWhite? -1: +1), position.getColumn() - 1);
		isValidMove = getBoard().positionExists(p) && isThereOpponentPiece(p);
		if(isValidMove)
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		p.setValues(position.getRow() + (isWhite? -1: +1), position.getColumn() + 1);
		isValidMove = getBoard().positionExists(p) && isThereOpponentPiece(p);
		if(isValidMove)
		{
			possibleMoves[p.getRow()][p.getColumn()] = true;
		}
		
		if((isWhite && position.getRow() == 3) || (!isWhite && position.getRow() == 4)) {
			Position left = new Position(position.getRow(), position.getColumn() - 1);
			if(getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVulnerable())
			{
				possibleMoves[left.getRow() + (isWhite? -1: +1) ][left.getColumn()] = true;
			}
			Position right = new Position(position.getRow(), position.getColumn() + 1);
			if(getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVulnerable())
			{
				possibleMoves[right.getRow() + (isWhite? -1: +1)][right.getColumn()] = true;
			}
		}
		
		return possibleMoves;
	}

	@Override
	public String toString() {
		return "P";
	}
}
