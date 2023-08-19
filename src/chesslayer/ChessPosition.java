package chesslayer;

import boardlayer.Position;

public class ChessPosition {
	
	private int row;
	private char column;
	
	public ChessPosition() {
		
	}
	
	public ChessPosition(int row, char column) 
	{
		this.row = row;
		this.column = column;
	}

	protected Position toPosition() 
	{
		return new Position(8-row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		ChessPosition chessPosition = new ChessPosition();
		chessPosition.row = 8 - position.getRow();
		chessPosition.column = (char)('a' + position.getColumn());
		return chessPosition;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}
	
	public String toString() {
		return row + ", " + column;
	}
	
}
