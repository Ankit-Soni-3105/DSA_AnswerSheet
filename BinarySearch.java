import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 15, 20};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();//app pahle bata ko ki kya search karna chahte ho

        int left = 0, right = arr.length - 1; // take two variables which points to starting and last indices of an array
        int index = -1;

        while(left <= right) { // tab tak chalne do jab tak ki aapka left right se chota aur barabar n ho jaye
            int mid = left + (right - left) / 2; // mid nikalo

            if(arr[mid] == target) {// agar aapka jo target hai mid ke hi barabar aa jaye wo wahi ruk jao
                index = mid;// aur mid ko index se update karo
                break;
            } else if(arr[mid] < target) { // nahi to mid ka element target se chota hai to left ko mid ke aage chhod do
                left = mid + 1;
            } else {
                right = mid - 1; // right ko isi taraf mid ke pichhe le aao
            }
        }

        System.out.println("Index: " + index);
    }
}
