package chess.main.model.pieces;

import chess.main.model.Board;

public class Piece extends Board{

	private int x, y;

	private String name;
	
	public Piece() {};
	
	public Piece(String name) {
		this.name = name;
	}
	
	public Piece(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Piece(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/* helper methods */
	
	public int[] getCoordinates() {
		int[] spot = new int[2];
		spot[0] = getX();
		spot[1] = getY();
		return spot;
	}
	
	public boolean isEmpty(int[] spot) {
		if (board[spot[0]][spot[1]] == new Blank('w').toString()) {
			return false;
		}
		return true;
	}
	
	public void movePiece(Piece p, int newX, int newY) {
		int x = p.getX() + newX;
		int y = p.getY() + newY;
		p.setX(x);
		p.setY(y);
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
