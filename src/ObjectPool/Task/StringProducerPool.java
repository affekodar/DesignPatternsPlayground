package ObjectPool.Task;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class StringProducerPool {

    Queue<StringProducer> producers = new ConcurrentLinkedDeque<>();

    public StringProducerPool (int numberOfProducers) {
        for (int i = 0; i < numberOfProducers; i++) {
            producers.add(new StringProducer(i));
        }
    }

    public StringProducer getObject() {
        StringProducer producer = producers.poll();
        return producer;
    }

    public void releaseObject(StringProducer producer) {
        this.producers.add(producer);
    }
}
