public class StrongNumberusingmethods {
    public static void main(String[] args) { // functions ki help se strong number
        int num = 145;
        if (isStrong(num)) {
            System.out.println(num + " is a Strong number");
        } else {
            System.out.println(num + " is not a Strong number");
        }
    }

    static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}
