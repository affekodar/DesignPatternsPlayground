package Facade.Task;

public class InvestmentFacade {

    private StockService stockService = new StockService();
    private OptionsService optionsService = new OptionsService();
    private FundService fundService = new FundService();
    private InvestmentAccountService investmentAccountService = new InvestmentAccountService();

    public String getAssets(String userId) {
        String assetReport = "Asset summary for " + userId + "\n";
        assetReport += "Stock amount " + stockService.getAssetAmount(userId) + "\n";
        assetReport += "Fund amount " + fundService.getAssetAmount(userId) + "\n";
        assetReport += "Options amount " + optionsService.getAssetAmount(userId) + "\n";
        return assetReport;
    }

    public boolean invest(String userId, String type, double amount) {
        if (investmentAccountService.getAvailableFunds(userId) < amount) {
            return false;
        }
        switch (type) {
            case "stock":
                stockService.buy(userId, amount);
                investmentAccountService.useAmount(userId, amount);
                break;

            case "fund":
                fundService.buy(userId, amount);
                investmentAccountService.useAmount(userId, amount);
                break;

            case "options":
                optionsService.buy(userId, amount);
                investmentAccountService.useAmount(userId, amount);
                break;

            default:
                System.out.println("Choose stock, fund or options");
        }
        return true;
    }
}
