package chess.main.model.pieces;

public class Queen extends Piece {
	
	public Queen(char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wQ");
		} else if (color == 'b' || color == 'B') {
			this.setName("bQ");
		}	
	}
	
	public Queen(int x, int y, char color) {
		if (color == 'w' || color == 'W') {
			this.setName("wQ");
		} else if (color == 'b' || color == 'B') {
			this.setName("bQ");
		}	
		this.setX(x);
		this.setY(y);
	}

}
