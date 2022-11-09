package aws.chess;

public abstract class Piece {
    private boolean white = false;
    private boolean killed = false;
    abstract boolean canMove(Board board, Tile from, Tile to);
}
