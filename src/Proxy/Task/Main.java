package Proxy.Task;

public class Main {

    public static void main(String[] args) {
        TextFileHandler textFileHandler = new TextFileHandler("C:\\Users\\alfon\\IdeaProjects\\DesignPatternsPlayground\\src\\Proxy\\Task\\textData.txt");
        textFileHandler.write("Luleå");
        textFileHandler.write("Färjestad");
        textFileHandler.write("Djurgården");
        textFileHandler.write("Rögle");
        textFileHandler.write("Leksand");
        System.out.println(textFileHandler.read());


        TextFileHandlerProxy textFileHandlerProxy = new TextFileHandlerProxy("C:\\Users\\alfon\\IdeaProjects\\DesignPatternsPlayground\\src\\Proxy\\Task\\textDataProxy.txt");
        try {
            textFileHandlerProxy.write("Luleå");
            textFileHandlerProxy.write("Färjestad");
            textFileHandlerProxy.write("Djurgården");
            textFileHandlerProxy.write("Rögle");
            textFileHandlerProxy.write("Leksand");
        } catch (InvalidLanguageException e) {
            System.out.println("Exception " + e.getMessage());
        }
        System.out.println(textFileHandlerProxy.read());
    }
}
