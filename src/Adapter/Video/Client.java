package Adapter.Video;

public class Client {
    private CurrentlyUsedInterface stringProducer;

    public Client(CurrentlyUsedInterface stringProducer) {
        this.stringProducer = stringProducer;
    }

    public String getString(){
        return this.stringProducer.createString();
    }
}
