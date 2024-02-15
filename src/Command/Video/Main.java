package Command.Video;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ImageProcessingPipeline processingPipeline = new ImageProcessingPipeline();

        processingPipeline.addCommand(new BlurCommand());
        processingPipeline.addCommand(new GrayScaleCommand());

        try {
            BufferedImage image = ImageIO.read(new File("C:/Users/alfon/IdeaProjects/DesignPatternsPlayground/src/Command/Video/img.png"));
            image = processingPipeline.execute(image);

            ImageIO.write(image, "png", new File("C:/Users/alfon/IdeaProjects/DesignPatternsPlayground/src/Command/Video/img_2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
