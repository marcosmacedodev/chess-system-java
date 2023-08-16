package chesslayer;

import boardlayer.Board;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() 
	{
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces()
	{
		ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];
		for(int itx = 0; itx < board.getRows(); itx++) {
			for(int ity = 0; ity < board.getColumns(); ity++) {
				chessPieces[itx][ity] = (ChessPiece)board.piece(itx, ity);
			}
		}
		return chessPieces;
	}
	

}
