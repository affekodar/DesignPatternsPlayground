package Proxy.Task;

import java.util.HashSet;
import java.util.Set;

public class TextFileHandlerProxy {
    private TextFileHandler textFileHandler;
    private Set<String> forbiddenWords = new HashSet<>();

    public TextFileHandlerProxy(String filePath) {
        this.textFileHandler = new TextFileHandler(filePath);
        this.forbiddenWords.add("Rögle");
        this.forbiddenWords.add("Färjestad");
        this.forbiddenWords.add("Djurgården");
        this.forbiddenWords.add("Hammarby");
        this.forbiddenWords.add("Leksand");
    }

    public void write(String string) throws InvalidLanguageException{
        if (forbiddenWords.contains(string)) {
            System.out.println("Logging forbidden word " + string);
            throw new InvalidLanguageException(string);
        } else {
            System.out.println("Logging write of word " + string);
            textFileHandler.write(string);
        }
    }

    public String read(){
        String string = textFileHandler.read();
        return string;
    }
}
