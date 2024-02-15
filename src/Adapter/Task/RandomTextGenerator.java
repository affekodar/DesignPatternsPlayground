package Adapter.Task;

import java.util.Random;

public class RandomTextGenerator implements TextGenerator{
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvxyz ";
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void createString(int length, Logger logger) {

            StringBuilder stringBuilder = new StringBuilder(length);

            for (int i = 0; i < 100; i++) {
                int index = CHARACTERS.length();
                char randomChar = CHARACTERS.charAt(new Random().nextInt(index));
                stringBuilder.append(randomChar);
            }
            setText(stringBuilder.toString());
            logger.log(getText());
        }

    }

