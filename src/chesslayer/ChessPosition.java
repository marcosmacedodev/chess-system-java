package chesslayer;

import boardlayer.Position;

public class ChessPosition {
	
	private int row;
	private char column;
	
	protected Position toPosition() {
		return new Position(row, column - 'A');
	}
	
	protected ChessPosition fromPosition(Position position) {
		ChessPosition chessPosition = new ChessPosition();
		chessPosition.row = position.getRow();
		chessPosition.column = (char)(position.getColumn() + 65);
		return chessPosition;
	}

}
