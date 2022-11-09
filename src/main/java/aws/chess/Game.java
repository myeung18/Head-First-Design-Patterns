package aws.chess;

import java.util.List;

public class Game {
    private Player[] players;
    private Board board;
    private List<Move> movesPlayed;


    private boolean makeMove(Move move, Player player) {
        Piece src = move.getSrc().getPiece();

        if (src.canMove(board, move.getSrc(), move.getDst())) {

        }

        return true;
    }
}

