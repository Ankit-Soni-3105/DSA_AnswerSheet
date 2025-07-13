import java.util.Arrays;

public class SortWords {
    public static void main(String[] args) {
        String sentence = "hello bhai kaise ho";
        String[] words = sentence.split(" ");

        Arrays.sort(words);

        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
