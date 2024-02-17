package WorkerThread.Video;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JobQueue.getInstance().addJob(new Job("Report 1", "This is the first report", new double[] {1, 2, 3, 4, 5}));
        JobQueue.getInstance().addJob(new Job("Report 2", "This is the second report", new double[] {10, 20, 30, 40, 50}));
        JobQueue.getInstance().addJob(new Job("Report 3", "This is the third report", new double[] {100, 200, 300, 400, 500}));

        new Thread(new ReportWorkerThread()).start();

        System.out.println(ReportService.getInstance().getReport());
        Thread.sleep(1000);
        System.out.println(ReportService.getInstance().getReport());
        Thread.sleep(6000);
        System.out.println(ReportService.getInstance().getReport());
        System.out.println(ReportService.getInstance().getReport());
    }
}
