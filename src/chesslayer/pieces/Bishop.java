package chesslayer.pieces;

import boardlayer.Board;
import boardlayer.Position;
import chesslayer.ChessPiece;
import chesslayer.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position pos = new Position(0, 0);
		
		//Nw
		pos.setValues(position.getRow() - 1, position.getColumn() - 1);
		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
			pos.setValues(pos.getRow() - 1, pos.getColumn() - 1);
		}
		if(getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Ne
		pos.setValues(position.getRow() - 1, position.getColumn() + 1);
		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
			pos.setValues(pos.getRow() - 1, pos.getColumn() + 1);
		}
		if(getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Sw
		pos.setValues(position.getRow() + 1, position.getColumn() - 1);
		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
			pos.setValues(pos.getRow() + 1, pos.getColumn() - 1);
		}
		if(getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Se
		pos.setValues(position.getRow() + 1, position.getColumn() + 1);
		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
			pos.setValues(pos.getRow() + 1, pos.getColumn() + 1);
		}
		if(getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		
		return possibleMoves;
	}

	@Override
	public String toString() 
	{
		return "B";
	}

}
