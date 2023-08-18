import java.util.InputMismatchException;
import java.util.Scanner;

import chesslayer.ChessPiece;
import chesslayer.ChessPosition;
import chesslayer.Color;

public class UI {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
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
			for(int ity = 0; ity < pieces[itx].length; ity++) 
			{
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
		if(background) {
			System.out.print(ANSI_BLUE_BACKGROUND);
		}
		if(piece == null) 
		{
			System.out.print("-" + ANSI_RESET);
		}
		else
		{
			if(piece.getColor() == Color.WHITE) {
				System.out.print(ANSI_WHITE + piece + ANSI_RESET);
			}
			else {
				System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
			}
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
