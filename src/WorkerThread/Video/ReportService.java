package WorkerThread.Video;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ReportService {

    Queue<String> reports = new ConcurrentLinkedDeque<>();
    private static ReportService reportService = new ReportService();
    public static ReportService getInstance() {return reportService;}
    public synchronized void addReport(String report) {
        reports.add(report);
    }
    public synchronized String getReport() {return reports.poll();}
}
