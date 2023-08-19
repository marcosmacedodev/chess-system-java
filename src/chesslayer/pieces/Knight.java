package chesslayer.pieces;

import boardlayer.Board;
import boardlayer.Position;
import chesslayer.ChessPiece;
import chesslayer.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position pos = new Position(0, 0);
		
		//Up
		pos.setValues(position.getRow() - 2, position.getColumn() - 1);
		if(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos))
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		pos.setValues(position.getRow() - 2, position.getColumn() + 1);
		if(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos))
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Left
		pos.setValues(position.getRow() - 1, position.getColumn() - 2);
		if(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos))
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		pos.setValues(position.getRow() + 1, position.getColumn() - 2);
		if(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos))
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Right
		pos.setValues(position.getRow() - 1, position.getColumn() + 2);
		if(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos))
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		pos.setValues(position.getRow() + 1, position.getColumn() + 2);
		if(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos))
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Down
		pos.setValues(position.getRow() + 2, position.getColumn() - 1);
		if(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos))
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		pos.setValues(position.getRow() + 2, position.getColumn() + 1);
		if(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos))
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		return possibleMoves;
	}
	
	@Override
	public String toString() {
		return "N";
	}

}
