package Adapter.Video;

public class StringProducer implements CurrentlyUsedInterface {
    @Override
    public String createString() {
        return "Det här är en sträng";
    }
}
