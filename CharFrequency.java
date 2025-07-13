import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "hello";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (char key : freqMap.keySet()) {
            System.out.println(key + ": " + freqMap.get(key));
        }
    }
}
