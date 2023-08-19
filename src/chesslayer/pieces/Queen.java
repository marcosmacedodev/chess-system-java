package chesslayer.pieces;

import boardlayer.Board;
import boardlayer.Position;
import chesslayer.ChessPiece;
import chesslayer.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position pos = new Position(0, 0);
		
		//Above
		pos.setValues(position.getRow() - 1, position.getColumn());
		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) 
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
			pos.setRow(pos.getRow() - 1);
		}
		if(getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Left
		pos.setValues(position.getRow(), position.getColumn() - 1);
		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) 
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
			pos.setColumn(pos.getColumn() - 1);
		}
		if(getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Right
		pos.setValues(position.getRow(), position.getColumn() + 1);
		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) 
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
			pos.setColumn(pos.getColumn() + 1);
		}
		if(getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		
		//Below
		pos.setValues(position.getRow() + 1, position.getColumn());
		while(getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) 
		{
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
			pos.setRow(pos.getRow() + 1);
		}
		if(getBoard().positionExists(pos) && isThereOpponentPiece(pos)) {
			possibleMoves[pos.getRow()][pos.getColumn()] = true;
		}
		//-----------------------------------------------------------------------//
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
	
	public String toString() {
		return "Q";
	}

}
