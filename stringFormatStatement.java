public class stringFormatStatement {
    public static void main(String[] args) {
        int quantity = 3;
        int totalMoney = 1000;
        float price = 450;

        String statement = String.format("I have %d dollars so I can buy %d football for %.2f dollars.",
                totalMoney, quantity, price);
//        String.format() is a method in Java that creates a formatted string,
//        just like printf() does — but it returns the string instead of printing it.
//        You can store this formatted string in a variable (statement), use it later, or print it.
        System.out.println(statement);
    }
}
