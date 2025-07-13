public class PrifixCount {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"}; // given an Array of Strings check start prefix == of each element of this array then count++
        String prefix = "at";
        int count = 0;

        for (String word: words){
            if (word.startsWith(prefix)){
                count++;
            }
        }

        System.out.println("Words with prefix \"" + prefix + "\": " + count);
    }
}
