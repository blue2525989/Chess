package chess.main.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import chess.main.model.pieces.Bishop;
import chess.main.model.pieces.King;
import chess.main.model.pieces.Knight;
import chess.main.model.pieces.Pawn;
import chess.main.model.pieces.Piece;
import chess.main.model.pieces.Queen;
import chess.main.model.pieces.Rook;

public class Game {
	
	public Board board = new Board();
	// pieces
	ArrayList<Piece> pieces = new ArrayList<Piece>();
	
	public String colorChoice() {
		String choice = JOptionPane.showInputDialog(null, "Which color do you choose?");
		return choice;
	}
	
	public void fillWhite(String choice) {
		int rowM;
		int rowP;
		int rowMB;
		int rowPB;
		if (choice.equalsIgnoreCase("white")) {
			rowM = 0; // 1
			rowP = 1; // 2
			rowMB = 7;
			rowPB = 6;
		}
		else {
			rowM = 7; // 8
			rowP = 6; // 7
			rowMB = 0;
			rowPB = 1;
		}
		
		Bishop bL = new Bishop(rowM, 2, 'w');
		Bishop bR = new Bishop(rowM, 5, 'w');
		Knight knL = new Knight(rowM, 1, 'w');
		Knight knR = new Knight(rowM, 6, 'w');
		Rook rL = new Rook(rowM, 0, 'w');
		Rook rR = new Rook(rowM, 7, 'w');
		Queen q = new Queen(rowM, 3, 'w');
		King k = new King(rowM, 4, 'w');
		// add pawns
		for (int i = 0; i < 8; i++) {
			pieces.add(new Pawn(rowP, i, 'w'));
		}
		// add the rest to other pieces
		pieces.add(bL);
		pieces.add(bR);
		pieces.add(knL);
		pieces.add(knR);
		pieces.add(rL);
		pieces.add(rR);
		pieces.add(q);
		pieces.add(k);
		
		
		Bishop bL2 = new Bishop(rowMB, 2, 'b');
		Bishop bR2 = new Bishop(rowMB, 5, 'b');
		Knight knL2 = new Knight(rowMB, 1, 'b');
		Knight knR2 = new Knight(rowMB, 6, 'b');
		Rook rL2 = new Rook(rowMB, 0, 'b');
		Rook rR2 = new Rook(rowMB, 7, 'b');
		Queen q2 = new Queen(rowMB, 3, 'b');
		King k2 = new King(rowMB, 4, 'b');
		// add pawns
		for (int i = 0; i < 8; i++) {
			pieces.add(new Pawn(rowPB, i, 'b'));
		}
		// add the rest to other pieces
		pieces.add(bL2);
		pieces.add(bR2);
		pieces.add(knL2);
		pieces.add(knR2);
		pieces.add(rL2);
		pieces.add(rR2);
		pieces.add(q2);
		pieces.add(k2);
	}

}
