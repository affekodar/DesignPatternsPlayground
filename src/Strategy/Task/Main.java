package Strategy.Task;

public class Main {

    public static void main(String[] args) {
        ProductsManager productsManager = new ProductsManager();
        productsManager.addProduct(new Products("Bubblegum", 20, 300));
        productsManager.addProduct(new Products("Coke", 15, 700));
        productsManager.addProduct(new Products("Candy bar", 10, 30));
        productsManager.addProduct(new Products("Hot Dogs", 30, 40));


        System.out.println("----Sort by product name----");
        productsManager.setStrategy("name");
        productsManager.sortProducts();
        productsManager.printProducts();

        System.out.println("----Sort by price----");
        productsManager.setStrategy("price");
        productsManager.sortProducts();
        productsManager.printProducts();

        System.out.println("----Sort by stock----");
        productsManager.setStrategy("stock");
        productsManager.sortProducts();
        productsManager.printProducts();
    }
}
