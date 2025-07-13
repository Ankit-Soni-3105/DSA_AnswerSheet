import java.util.Scanner;

public class ToggleString {
    //we have a String which collection of lower and upper case character then convert to lower upper like toggle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "AsdfSDFASDFJKSdfosjdfSDFSGG";
        StringBuilder res = new StringBuilder();

        for (char ch : st.toCharArray()) { //har bar check karte jao ki string ka har character uppercase hai to lowercase me convert karo else convert into uppercase also append it on result
            if (Character.isUpperCase(ch)) {
                res.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                res.append(Character.toUpperCase(ch));
            } else {
                res.append(ch);
            }
        }

        System.out.println("The Toggled String is: " + res.toString());
    }
}
