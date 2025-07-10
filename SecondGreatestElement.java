public class SecondGreatestElement {
    public static void main(String[] args) {
        int[] arr = {2, 96, 69, 77, 145, 20};
        // do variable lete hai max and secondMax then initialized by its minimum value
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {// then we iterate an Array by the ForEach loop dhyan rahe forEach loop ony arrays me hi kam karta hai
            if (num > max) { // check karo ki jo aapme array me element hai kya wo max se bada hai agar hai to
                secondMax = max; // max ko aap secondMax me store kar lo
                max = num; // then again max ko num se update kar do
            } else if (num > secondMax && num != max) { // aur agar num bada hai secondMax se sath hi sath agar max num ke barabar n ho to
                // second max ko num se update kar do
                secondMax = num;
            }
        }

        System.out.println("Second greatest element = " + secondMax);
    }
}
