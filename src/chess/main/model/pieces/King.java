package chess.main.model.pieces;

public class King extends Piece {
	
	public King(char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wK");
		} else if (color == 'b' || color == 'B') {
			this.setName("bK");
		}	
	}
	
	public King(int x, int y, char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wK");
		} else if (color == 'b' || color == 'B') {
			this.setName("bK");
		}	
		this.setX(x);
		this.setY(y);
	}

}
