package FactoryMethod.Task;

import java.security.SecureRandom;

public class DigitStringProducer extends StringProducer{

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvxyz";
    private static final SecureRandom secureRandom = new SecureRandom();
    private boolean upperCase;
    public DigitStringProducer(int length, boolean upperCase) {
        this.length = length;
        this.upperCase = upperCase;
        createString();
    }

    @Override
    public String createString() {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = secureRandom.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(randomIndex));
        }
        if (upperCase == true) {
            return stringBuilder.toString().toUpperCase();
        } else {
            return stringBuilder.toString();
        }

    }

}
