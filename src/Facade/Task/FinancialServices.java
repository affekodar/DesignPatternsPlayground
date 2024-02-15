package Facade.Task;

import java.util.HashMap;

public class FinancialServices {
    protected HashMap<String, Double> data = new HashMap<>();

    public double getAssetAmount(String userId) {
        if (data.containsKey(userId)) {
            return data.get(userId);
        }
        return 0;
    }

    public void buy(String userId, double amount) {
        if (data.containsKey(userId)) {
            data.put(userId, data.get(userId) - amount);
        }
    }
}
