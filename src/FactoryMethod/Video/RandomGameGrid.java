package FactoryMethod.Video;

import java.util.Random;

public class RandomGameGrid extends GameGrid{
    public RandomGameGrid(int dimension, int numberOfShips) {
        this.dimension = dimension;
        this.numberOfShips = numberOfShips;
        this.grid = new int[dimension][dimension];
        addShip();
    }

    @Override
    public void addShip() {
        int createdShips = 0;
        Random random = new Random();
        while (createdShips < numberOfShips) {
            int row = random.nextInt(dimension);
            int col = random.nextInt(dimension);
            if (grid[row][col] == 0) {
                grid[row][col] = 1;
                createdShips++;
            }
        }
    }
}
