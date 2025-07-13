public class capitalizeFirst_Last {
    public static void main(String[] args) {
        String sentence = "Hello bhai Kaise ho";

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() == 1) sb.append(word.toUpperCase());
            else {
                String first = word.substring(0, 1).toUpperCase();
                String middle = word.substring(1, word.length() - 1);
                String last = word.substring(word.length() - 1).toUpperCase();

                sb.append(first).append(middle).append(last);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
