package chesslayer;

import boardlayer.Board;
import boardlayer.Piece;

public class ChessPiece extends Piece {

	private Color color;
	public ChessPiece(Board board, Color color) {
		super(board);
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	public Color getColor() {
		return color;
	}
	
	

}
