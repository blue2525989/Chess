package chess.main.controller;

import java.util.ArrayList;

import chess.main.model.Game;
import chess.main.model.pieces.Piece;

public class MoveController {
	
	public Game game = new Game();
	
	public ArrayList<Piece> pieces;
	
	public void initializeGame() {
		String choice = game.colorChoice();
		game.board.fillBoardInitial();
		game.board.displayBoard();
		game.board.addPieces(choice);
		// display board again
		game.board.displayBoard();
		
	}

}
