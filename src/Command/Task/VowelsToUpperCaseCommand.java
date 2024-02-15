package Command.Task;

public class VowelsToUpperCaseCommand implements StringProcessingCommand{
    @Override
    public String process(String string) {
        StringBuilder newString  = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (isVowel(string.charAt(i))) {
                newString.append(Character.toUpperCase(c));
            } else {
                newString.append(c);
            }
        }

        return newString.toString();
    }


    public boolean isVowel(char c) {
            return "AEIOUaeiou".contains(String.valueOf(c));
    }
}
