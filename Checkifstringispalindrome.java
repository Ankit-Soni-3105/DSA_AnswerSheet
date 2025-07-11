import java.util.Scanner;

public class Checkifstringispalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: "); // bhai markram hi lena input
        String str = sc.nextLine();

        boolean isPalindrome = true;
        int i = 0, j = str.length() - 1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = true;
                break;
            }
            i++;
            j--;
        }
        System.out.print("Palindrome " + isPalindrome);
    }
}
