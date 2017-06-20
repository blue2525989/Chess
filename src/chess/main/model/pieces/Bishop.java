package chess.main.model.pieces;

public class Bishop extends Piece {
	
	public Bishop(char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wB");
		} else if (color == 'b' || color == 'B') {
			this.setName("bB");
		}	
	}

	public Bishop(int x, int y, char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wB");
		} else if (color == 'b' || color == 'B') {
			this.setName("bB");
		}		
		this.setX(x);
		this.setY(y);
	}
}
