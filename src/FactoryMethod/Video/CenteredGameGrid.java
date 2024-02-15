package FactoryMethod.Video;

import java.util.Random;

public class CenteredGameGrid extends GameGrid {
    private int border;

    public CenteredGameGrid(int dimension, int numberOfShips,int border) {
        this.dimension = dimension;
        this.numberOfShips = numberOfShips;
        this.border = border;
        this.grid = new int[dimension][dimension];
        addShip();
    }

    @Override
    public void addShip() {
        int createdShips = 0;
        Random random = new Random();
        while (createdShips < numberOfShips) {
            int row = random.nextInt(dimension - border*2) + border;
            int col = random.nextInt(dimension - border*2) + border;
            if (grid[row][col] == 0) {
                grid[row][col] = 1;
                createdShips++;
            }
        }
    }
}
