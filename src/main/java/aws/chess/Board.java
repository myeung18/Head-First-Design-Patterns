package aws.chess;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Tile>> tiles;
    private Tile[][] allTiles;

    private int width;
    private int height;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private void initialize() {
        this.allTiles = new Tile[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.allTiles[i][j] = new Tile(null, i, j);
            }
        }
    }
    private void init() {
        this.tiles = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            this.tiles.add(new ArrayList<>());
            for (int j = 0; j < height; j++) {
                this.tiles.get(i).add(new Tile(null, i, j));
            }
        }
    }

    private boolean isValid(int x, int y) {
        //TODO
        return true;
    }
    public Tile getTile(int x, int y) {
        if (!isValid(x, y)) return null;
        return allTiles[x][y];
    }

}
