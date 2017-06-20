package chess.main.model.pieces;

public class Rook extends Piece {
	
	public Rook(char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wR");
		} else if (color == 'b' || color == 'B') {
			this.setName("bR");
		}	
	}
	
	public Rook(int x, int y, char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wR");
		} else if (color == 'b' || color == 'B') {
			this.setName("bR");
		}	
		this.setX(x);
		this.setY(y);
	}

}
