package FactoryMethod.Task;

import java.security.SecureRandom;

public class RandomStringProducer extends StringProducer{

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
    private static final SecureRandom secureRandom = new SecureRandom();
    public RandomStringProducer(int length) {
        this.length = length;
        createString();
    }

    @Override
    public String createString() {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = secureRandom.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}
