package Facade.Task;

import java.util.HashMap;

public class InvestmentAccountService {

    private HashMap<String, Double> data = new HashMap<>();

    public InvestmentAccountService() {
        data.put("userA", 10000.0d);
    }

    public double getAvailableFunds(String userId) {
        if (data.containsKey(userId)) {
            return data.get(userId);
        }
        return 0;
    }

    public void useAmount(String userId, double amount) {
        if (data.containsKey(userId)) {
            data.put(userId, data.get(userId) - amount);
        }
    }
}
