import java.util.HashMap;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // HashMap to store frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element frequencies:");
        for (int key : freqMap.keySet()) {
            System.out.println(key + ": " + freqMap.get(key));
        }
    }
}
