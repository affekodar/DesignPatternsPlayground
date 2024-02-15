package Adapter.Video;

public class Main {

    public static void main(String[] args) {

/*      StringProducer stringProducer = new StringProducer();
        Client client = new Client(stringProducer);
        System.out.println(client.getString());*/

        StringProducerAdapter stringProducerAdapter = new StringProducerAdapter();
        Client client1 = new Client(stringProducerAdapter);
        System.out.println(client1.getString());
    }
}
