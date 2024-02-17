package WorkerThread.Video;

public class ReportWorkerThread implements Runnable{
    @Override
    public void run() {
        while (true) {
            Job job = JobQueue.getInstance().getJob();
            if (job != null ) {
                System.out.println("Report generation started");
                double amount = 0;
                for (int i = 0; i < job.getTransaction().length ; i++) {
                    amount += job.getTransaction()[i];
                }
                String report = job.getTitle() + "\n" + job.getText() + "\n" + "Amount: " + amount + "\n";
                ReportService.getInstance().addReport(report);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
