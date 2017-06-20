package chess.main.model.pieces;

public class Knight extends Piece {

	public Knight(char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wKn");
		} else if (color == 'b' || color == 'B') {
			this.setName("bKn");
		}	
	}
	
	public Knight(int x, int y, char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wKn");
		} else if (color == 'b' || color == 'B') {
			this.setName("bKn");
		}	
		this.setX(x);
		this.setY(y);
	}

}
