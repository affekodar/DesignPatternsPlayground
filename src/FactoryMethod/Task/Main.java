package FactoryMethod.Task;

public class Main {

    public static void main(String[] args) {
        StringProducer stringProducer = StringProducer.createStringObject(10);
        System.out.println(stringProducer.createString());

        StringProducer stringProducer1 = StringProducer.createStringObject(10, true);
        System.out.println(stringProducer1.createString());
    }
}
