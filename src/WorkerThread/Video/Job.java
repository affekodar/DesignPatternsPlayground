package WorkerThread.Video;

public class Job {
    private String title;
    private String text;
    private double[] transaction;

    public Job(String title, String text, double[] transaction) {
        this.title = title;
        this.text = text;
        this.transaction = transaction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double[] getTransaction() {
        return transaction;
    }

    public void setTransaction(double[] transaction) {
        this.transaction = transaction;
    }
}
