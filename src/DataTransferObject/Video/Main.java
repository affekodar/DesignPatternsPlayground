package DataTransferObject.Video;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Car car = new Car("Grey", "Audi", 220);
        CarDTO carDTO = new CarDTO(car);
        String filePath = "C:\\Users\\alfon\\IdeaProjects\\DesignPatternsPlayground\\src\\DataTransferObject\\Video\\DTODemo";

        try{
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(carDTO);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException notFoundException) {
            notFoundException.printStackTrace();
        }
        Server server = new Server();
        server.accept(filePath);
    }
}
