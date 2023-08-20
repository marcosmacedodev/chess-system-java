import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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
		List<ChessPiece> captured = new ArrayList<>();
		
		while(!cm.getCheckMate()) {
			try {
				UI.clearScreen();
				UI.printMatch(cm, captured);
	
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean [][] possibleMoves = cm.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(cm.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = cm.performChessMove(source, target);
				
				if(capturedPiece != null) {
					captured.add(capturedPiece);
				}
				
				if(cm.getPromoted() != null) {
					System.out.print("Enter piece for promotion B/Q/N/R: ");
					String type = sc.nextLine();
					cm.replacePromotedPiece(type);
				}
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
		UI.clearScreen();
		UI.printMatch(cm, captured);
	}

}
