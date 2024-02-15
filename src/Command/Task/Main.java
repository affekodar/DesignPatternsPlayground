package Command.Task;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringProcessingPipeline stringProcessingPipeline = new StringProcessingPipeline();

        stringProcessingPipeline.addCommand(new VowelsToUpperCaseCommand());

        System.out.println("antal kommandon: " + stringProcessingPipeline.getPipeline().size());

        String string = "jasdfhjklasdfklasjdaskld";
        string = stringProcessingPipeline.execute(string);
        System.out.println(string);

    }
}
