import java.util.InputMismatchException;
import java.util.Scanner;

import chesslayer.ChessException;
import chesslayer.ChessMatch;
import chesslayer.ChessPiece;
import chesslayer.ChessPosition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ChessMatch cm = new ChessMatch();
		
		while(true) {
			try {
			UI.clearScreen();
			UI.printBoard(cm.getPieces());

			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = cm.performChessMove(source, target);
			}
			catch(ChessException ex) {
				System.out.println(ex.getMessage());
				sc.next();
			}
			catch(InputMismatchException ex) {
				System.out.println(ex.getMessage());
				sc.next();
			}
		}
	}

}
