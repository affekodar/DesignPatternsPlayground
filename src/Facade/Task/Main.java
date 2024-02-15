package Facade.Task;

public class Main {
    public static void main(String[] args) {
        InvestmentFacade investmentFacade = new InvestmentFacade();
        System.out.println(investmentFacade.getAssets("userA"));

        boolean b = investmentFacade.invest("userA", "stock", 12000.0d);
        if (!b) {
            System.out.println("insufficient funds!");
        } else {
            System.out.println(investmentFacade.getAssets("userA"));
        }
    }
}
