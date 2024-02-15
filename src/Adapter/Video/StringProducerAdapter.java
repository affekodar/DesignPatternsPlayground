package Adapter.Video;

public class StringProducerAdapter implements CurrentlyUsedInterface{
    @Override
    public String createString() {
        CandidateStringProducer candidateStringProducer = new CandidateStringProducer();
        return candidateStringProducer.makeString(25);
    }
}
