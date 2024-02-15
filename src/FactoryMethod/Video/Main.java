package FactoryMethod.Video;

public class Main {
    public static void main(String[] args) {

        GameGrid gameGrid = GameGrid.createGameGrid(10, 20);
        gameGrid.printGrid();
        System.out.println("-----------------");
        GameGrid gameGrid2 = GameGrid.createGameGrid(12, 20, 1);
        gameGrid2.printGrid();
    }

}
