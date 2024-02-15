package ObjectPool.Task;

import java.security.SecureRandom;

public class StringProducer {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
    private static final SecureRandom secureRandom = new SecureRandom();
    private int id;

    public String createString() {
        StringBuilder stringBuilder = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int randomIndex = secureRandom.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }

    public StringProducer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
