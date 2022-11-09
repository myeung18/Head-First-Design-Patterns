package aws.chess;

public class GameController {
    public static void main(String[] args) {
        int[] players = {99, 43};

        for (int i = 0 ; i < 10; i++) {
            int r = (int) (Math.random() * players.length);
            System.out.println(players[r]);
        }
    }
}
