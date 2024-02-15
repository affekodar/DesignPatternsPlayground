package FactoryMethod.Task;

public abstract class StringProducer {

    protected int length;

    public static RandomStringProducer createStringObject(int length){
        return new RandomStringProducer(length);
    }

    public static DigitStringProducer createStringObject(int length, boolean upperCase) {
        return new DigitStringProducer(length, upperCase);
    }

    public abstract String createString();




}
