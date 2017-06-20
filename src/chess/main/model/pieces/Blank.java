package chess.main.model.pieces;

public class Blank extends Piece {
	
	public Blank(char color) {
		this.setName("+");
	}

	public Blank(int x, int y, char color) {
		this.setName("+");	
		this.setX(x);
		this.setY(y);
	}
}
