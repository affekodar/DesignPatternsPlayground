package Strategy.Task;

import java.util.Comparator;

public class PriceComparator implements Comparator<Products> {
    @Override
    public int compare(Products product1, Products product2) {
        return (int) (product1.getPrice() - product2.getPrice());
    }
}
