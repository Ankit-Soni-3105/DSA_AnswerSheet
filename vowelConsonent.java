import java.util.Scanner;

public class vowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Character: ");
        char ch = sc.nextLine().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.print(ch +"Character is Vowel");
        }else System.out.print(ch+ "the character is Consonant");
    }
}
