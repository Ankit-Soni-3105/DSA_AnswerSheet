public class MaxWordsFound {
    public static void main(String[] args) {
        String[] sentences = {
                "Alice and Bob love LeetCode",
                "I think so too",
                "This is great thanks very much"
        };

        int maxWords =0;
        for (String sentence : sentences){
            int count = sentence.split(" ").length;
            maxWords = Math.max(maxWords, count);
        }
        System.out.println("the max words is: "+ maxWords);
    }
}
