package chesslayer;

import boardlayer.Board;
import boardlayer.Piece;

public abstract class ChessPiece extends Piece {

	private Color color;
	public ChessPiece(Board board, Color color) {
		super(board);
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	

}
