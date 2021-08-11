import java.util.Scanner;

class Text {
    String text;
    String[] lines;
    int lineCount;
    String[] words;
    int wordCount;
    int[] vowelsPerLine;
    int oddLines;
    int oddWords;

    public Text(String text) {
        this.text = text;
        // Split text into lines if theres a character . , ? !" etc.
        lines = text.split("[\\.\\,\\?\\!\\\"\\']");
        lineCount = lines.length;
        words = text.split("\\s");
        wordCount = words.length;
        vowelsPerLine = new int[lineCount];
        oddLines = 0;
        oddWords = 0;
        for (int i = 0; i < lineCount; i++) {
            vowelsPerLine[i] = countVowels(lines[i]);
            if (vowelsPerLine[i] % 2 != 0) {
                oddLines++;
            }
        }
        for (int i = 0; i < wordCount; i++) {
            if (words[i].length() % 2 != 0) {
                oddWords++;
            }
        }
    }
    public String result() {
        StringBuilder sb = new StringBuilder();
        for (int vpl : vowelsPerLine) {
            sb.append(" ").append(vpl);
        }
        return "Text: " + text + "\n" +
                "Lines: " + lineCount + "\n" +
                "Words: " + wordCount + "\n" +
                "Vowels per line:" + sb.toString() + "\n" + 
                "Odd lines: " + oddLines + "\n" +
                "Odd words: " + oddWords;
    }
    private int countVowels(String line) {
        int vowels = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = Character.toLowerCase(line.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
            vowels++;
            }
        }
        return vowels;
    }
}
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        System.out.println("Input:");
        String text = in.nextLine();
        Text t = new Text(text);
        System.out.println("Output:\n"+t.result());

        in.close();
    }
}