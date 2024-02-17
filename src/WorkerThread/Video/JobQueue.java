package WorkerThread.Video;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class JobQueue {

    Queue<Job> jobs = new ConcurrentLinkedDeque<>();

    private static JobQueue jobQueue = new JobQueue();
    public static JobQueue getInstance() {
        return jobQueue;
    }
    public synchronized void addJob(Job job) {
        System.out.println("Number of jobs in queue before job added " + jobs.size());
        jobs.add(job);
    }
    public synchronized Job getJob(){
        System.out.println("Number of jobs in queue before job is removed " + jobs.size());
        return jobs.poll();
    }
}
