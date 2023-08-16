package chesslayer;

import boardlayer.Board;
import boardlayer.Position;
import chesslayer.pieces.King;
import chesslayer.pieces.Rook;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() 
	{
		board = new Board(8, 8);
		initialSetup();
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

	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}

}
