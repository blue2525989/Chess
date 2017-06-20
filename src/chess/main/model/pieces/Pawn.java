package chess.main.model.pieces;

public class Pawn extends Piece {
	
	public Pawn(char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wP");
		} else if (color == 'b' || color == 'B') {
			this.setName("bP");
		}	
	}
	
	public Pawn(int x, int y, char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wP");
		} else if (color == 'b' || color == 'B') {
			this.setName("bP");
		}	
		this.setX(x);
		this.setY(y);
	}

}
