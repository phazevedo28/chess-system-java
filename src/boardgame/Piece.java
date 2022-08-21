package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] headquarters = possibleMoves();
		for (int i = 0; i < headquarters.length; i++) {
			for (int j = 0; j < headquarters.length; j++) {
				if (headquarters[i][j]) {
					return true;
				}

			}
		}
		return false;
	}

}
