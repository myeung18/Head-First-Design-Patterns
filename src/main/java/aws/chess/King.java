package aws.chess;

public class King extends Piece{
    @Override
    boolean canMove(Board board, Tile from, Tile to) {
        return false;
    }
}
