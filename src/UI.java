import java.util.InputMismatchException;
import java.util.Scanner;

import chesslayer.ChessPiece;
import chesslayer.ChessPosition;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int itx = 0; itx < pieces.length; itx++) {
			System.out.print((8-itx) + " ");
			for(int ity = 0; ity < pieces[itx].length; ity++) {
				printPiece(pieces[itx][ity], false);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void printBoard(ChessPiece[][] pieces, boolean [][] possibleMoves) {
		for(int itx = 0; itx < pieces.length; itx++) {
			System.out.print((8-itx) + " ");
			for(int ity = 0; ity < pieces[itx].length; ity++) {
				printPiece(pieces[itx][ity], possibleMoves[itx][ity]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	private static void printPiece(ChessPiece piece, boolean background) {
		if(piece == null) 
		{
			System.out.print("-");
		}
		else
		{
			System.out.print(piece);
		}
		System.out.print(" ");
	}
	
	public static ChessPosition readChessPosition(Scanner sc) {
		try 
		{
			String s = sc.nextLine();
			char column = s.charAt(0);
			int row = Integer.parseInt(s.substring(1));
			return new ChessPosition(row, column);
		}
		catch(RuntimeException ex) 
		{
			throw new InputMismatchException("Erro reading ChessPosition. Valid values are from a1 to h8.");
		}
	}

}
