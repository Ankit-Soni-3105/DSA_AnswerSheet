import java.util.HashMap;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // HashMap to store frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.print("Unique elements: ");
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }
}
