package DataTransferObject.Video;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Server {

    public void accept(String filePath) throws FileNotFoundException {

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            CarDTO carDTO = (CarDTO) objectInputStream.readObject();
            System.out.println("Server received CarDTO");
            System.out.println(carDTO.getId() + " " + carDTO.getBrand() + " " + carDTO.getColor());
        } catch (IOException | ClassNotFoundException ioException) {
            ioException.printStackTrace();
        }
    }
}
