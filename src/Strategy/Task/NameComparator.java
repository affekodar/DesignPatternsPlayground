package Strategy.Task;

import java.util.Comparator;

public class NameComparator implements Comparator<Products> {
    @Override
    public int compare(Products product1, Products product2) {
        return product1.getName().compareTo(product2.getName());
    }
}
