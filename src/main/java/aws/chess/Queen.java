package aws.chess;

public class Queen extends Piece {
    @Override
    boolean canMove(Board board, Tile from, Tile to) {
        return false;
    }
}
