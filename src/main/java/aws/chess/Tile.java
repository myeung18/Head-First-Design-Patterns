package aws.chess;

public class Tile {
    private Piece piece;
    private int x;
    private int y;

    public Tile(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    public Piece getPiece() {
        return piece;
    }
}
