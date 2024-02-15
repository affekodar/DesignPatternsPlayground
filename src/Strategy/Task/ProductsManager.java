package Strategy.Task;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductsManager {
    private ArrayList<Products> products = new ArrayList();
    private String strategy;

    public void addProduct(Products product) {
        this.products.add(product);
    }
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void sortProducts() {
        Comparator<Products> comparator;
        switch (strategy) {
            case "price": comparator = new PriceComparator();
            break;
            case "stock": comparator = new StockComparator();
            default: comparator = new NameComparator();
        }
        products.sort(comparator);
    }

    public void printProducts() {
        for (Products product: products) {
            System.out.println(product.getName() + " " + product.getPrice() + " " + product.getStock());
        }
    }
}
