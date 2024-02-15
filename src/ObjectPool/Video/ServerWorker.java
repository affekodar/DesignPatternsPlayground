package ObjectPool.Video;

import java.util.Random;

public class ServerWorker {
    private int id;
    public ServerWorker(int id) {
        this.id = id;
    }

    public String createContent() {
        String result = "";
        Random random = new Random();

        for (int i = 0; i < 100000000; i++) {
            if (i%100000000 == 0) {
                result += random.nextInt(10);
            }
        }
        return result;
    }
    public int getId(){
        return id;
    }
}
