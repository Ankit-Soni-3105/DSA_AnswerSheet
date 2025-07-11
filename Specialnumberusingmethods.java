public class Specialnumberusingmethods {
    public static boolean isSpecial(int num) {
        int sum = 0, temp = num, product = 1;
        while (temp != 0) {
            int digits = temp % 10;
            sum += digits;
            product *= digits;
            temp /= 10;
        }
        return (sum + product) == num;
    }

    public static void main(String[] args) {
        int num = 59;
        if (isSpecial(num)) {
            System.out.println(num + " is a Special number");
        } else {
            System.out.println(num + " is not a Special number");
        }
    }
}
