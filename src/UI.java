import chesslayer.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int itx = 0; itx < pieces.length; itx++) {
			System.out.print((8-itx) + " ");
			for(int ity = 0; ity < pieces[itx].length; ity++) {
				printPiece(pieces[itx][ity]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else
		{
			System.out.print(piece);
		}
		System.out.print(" ");
	}

}
