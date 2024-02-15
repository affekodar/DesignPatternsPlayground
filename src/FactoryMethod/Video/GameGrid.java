package FactoryMethod.Video;

public abstract class GameGrid {

    protected int dimension;
    protected int numberOfShips;
    protected int [][] grid;

    public static GameGrid createGameGrid(int dimension, int numberOfShips) {
        return new RandomGameGrid(dimension, numberOfShips);
    }

    public static GameGrid createGameGrid(int dimension, int numberOfShips, int border) {
        return new CenteredGameGrid(dimension, numberOfShips, border);
    }

    public abstract void addShip();

    public void printGrid() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.print("\n");
        }
    }
}
