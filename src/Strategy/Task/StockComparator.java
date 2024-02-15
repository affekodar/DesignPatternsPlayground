package Strategy.Task;

import java.util.Comparator;

public class StockComparator implements Comparator<Products> {
    @Override
    public int compare(Products product1, Products product2) {
        return product1.getStock() - product2.getStock();
    }
}
