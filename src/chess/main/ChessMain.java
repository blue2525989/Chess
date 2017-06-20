package chess.main;

import chess.main.controller.MoveController;

public class ChessMain {
	
	MoveController move = new MoveController();
	
	public ChessMain() {
		move.initializeGame();
	}
	
	/* MAIN METHOD */
	public static void main(String[] args) {
		new ChessMain();
	}

}
