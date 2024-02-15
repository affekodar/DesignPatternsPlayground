package ObjectPool.Task;

public class Main {
    public static void main(String[] args) {
        StringProducerPool stringProducerPool = new StringProducerPool(3);
        StringProducer stringProducer1 = stringProducerPool.getObject();
        StringProducer stringProducer2 = stringProducerPool.getObject();
        StringProducer stringProducer3 = stringProducerPool.getObject();

        System.out.println(stringProducer1.createString());
        stringProducerPool.releaseObject(stringProducer1);
        System.out.println(stringProducer2.createString());
        stringProducerPool.releaseObject(stringProducer2);
        System.out.println(stringProducer3.createString());
        stringProducerPool.releaseObject(stringProducer3);

    }
}
