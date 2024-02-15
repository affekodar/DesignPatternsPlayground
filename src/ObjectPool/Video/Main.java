package ObjectPool.Video;

public class Main {

    public static void main(String[] args) {
        WorkerPool workerPool = new WorkerPool(5);
        ServerWorker serverWorker1 = workerPool.getObject();
        ServerWorker serverWorker2 = workerPool.getObject();
        ServerWorker serverWorker3 = workerPool.getObject();
        ServerWorker serverWorker4 = workerPool.getObject();
        ServerWorker serverWorker5 = workerPool.getObject();

        System.out.println(serverWorker1.createContent());
        workerPool.releaseObject(serverWorker1);
        System.out.println(serverWorker2.createContent());
        workerPool.releaseObject(serverWorker2);
        System.out.println(serverWorker3.createContent());
        workerPool.releaseObject(serverWorker3);
        System.out.println(serverWorker4.createContent());
        workerPool.releaseObject(serverWorker4);
        System.out.println(serverWorker5.createContent());
        workerPool.releaseObject(serverWorker5);
    }
}
