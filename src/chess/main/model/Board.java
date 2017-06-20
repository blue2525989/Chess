package chess.main.model;

import java.util.ArrayList;

import chess.main.model.pieces.Blank;
import chess.main.model.pieces.Piece;

public class Board {

	public static String[][] board = new String[8][8];
	
	public static enum spaces {A, B, C, D, E, F, G, H};
	
	
	public void fillBoardInitial() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = new Blank('b').toString();
			}
		}
	}
	
	public void displayBoard() {
		// display board coordinates
		spaces[] coors = spaces.values();
		System.out.println();
		System.out.print("\t");
		for (int i = 0; i < 8; i++) {
			System.out.print(coors[i] + "  ");
		}
		System.out.println("\n");
		
		for (int i = 0; i < board.length; i++) {
			// left side grid coordinates
			System.out.print((i+1) + "\t");
			
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[j][j]+"  ");
			}
			// right side grid coordinates
			System.out.print("\t" + (i+1));
			System.out.println();
		}
		// display board coordinates on bottom
		System.out.println();
		System.out.print("\t");
		for (int i = 0; i < 8; i++) {
			System.out.print(coors[i] + "  ");
		}
		System.out.println("\n");
	}
	
	public void addPieces(String choice) {
		Game game = new Game();
		game.fillWhite(choice);
		ArrayList<Piece> white = game.pieces;
		for (int i = 0; i < white.size(); i++) {
			int x = white.get(i).getX();
			int y = white.get(i).getY();
			System.out.println(white.get(i) + " x ="+x+" y ="+y);
			addPiece(white.get(i));
		}
		
	}
	
	public void addPiece(Piece p) {
		int newX = p.getX();
		int newY = p.getY();
		board[newX][newY] = p.toString();
	}
	
}
