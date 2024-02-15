package ObjectPool.Video;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WorkerPool {
    Queue<ServerWorker> workers = new ConcurrentLinkedDeque<>();

    public WorkerPool (int numberOfWorkers) {
        for (int i = 0; i < numberOfWorkers; i++) {
            workers.add(new ServerWorker(i));
        }
    }

    public ServerWorker getObject() {
        System.out.println("Number of workers before object taken: " + workers.size());
        ServerWorker worker = workers.poll();
        if (worker != null) {
            System.out.println("Worker " + worker.getId() + " taken ");
        }
        return worker;
    }

    public void releaseObject(ServerWorker worker) {
        this.workers.add(worker);
        System.out.println("Number of workers after object released: " + this.workers.size());
        System.out.println("Worker " + worker.getId() + " released.");
    }
}
