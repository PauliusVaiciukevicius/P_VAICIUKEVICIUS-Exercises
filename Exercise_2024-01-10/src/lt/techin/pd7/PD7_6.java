package lt.techin.pd7;

public class PD7_6 {
    public static void main(String[] args) {
        String text = "Java is for gods";
        int charCount = countCharsInString(text);
        System.out.println(charCount);
    }

    public static int countCharsInString(String text) {
        int charCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            char charAtIndex = text.charAt(i);
            if (Character.isLetter(charAtIndex)) {
                charCounter++;
            }
        }
        return charCounter;
    }
}
