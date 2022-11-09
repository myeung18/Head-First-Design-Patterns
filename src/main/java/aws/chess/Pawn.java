package aws.chess;

public class Pawn extends Piece {
    @Override
    boolean canMove(Board board, Tile from, Tile to) {
        return false;
    }
}
