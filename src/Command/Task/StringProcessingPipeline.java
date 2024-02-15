package Command.Task;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class StringProcessingPipeline {
    private ArrayList<StringProcessingCommand> pipeline = new ArrayList<>();

    public void addCommand(StringProcessingCommand command) {
        pipeline.add(command);
    }

    public String execute(String string) {
        String result = string;
        for (StringProcessingCommand command : pipeline) {
            result = command.process(result);
        }
        return result;
    }

    public ArrayList<StringProcessingCommand> getPipeline() {
        return pipeline;
    }
}
