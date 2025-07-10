public class FindGreatestElementandIndex {
    public static void main(String[] args) {
        int[] arr = {2, 96, 69, 77, 145, 20};// here is array
        int max = arr[0]; // initialize by 0th indexed max variable
        int index = 0; // also index by 0

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) { // check agar array ka ek bhi element max se bada hota hai to
                max = arr[i];// same index max me hi assign karte jao then
                index = i;// index same index ko track kar lo
            }
        }

        System.out.println("Max element = " + max + " found at index " + index);
    }
}
