package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch c = new ChessMatch();
		
		UI.printBoard(c.getPieces());
		
	}
}
