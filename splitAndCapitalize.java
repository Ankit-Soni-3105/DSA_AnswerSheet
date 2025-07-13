public class splitAndCapitalize {
    public static void main(String[] args) {
        String sentence = "Hello bhai kaise ho";

        String[] words = sentence.split(" ");

        for (String word : words) {
            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(capitalized);
        }
    }
}
