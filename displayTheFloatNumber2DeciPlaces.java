public class displayTheFloatNumber2DeciPlaces {
    public static void main(String[] args) {
        float num = 458.541315f;
        //In Java, when you write a decimal number like 458.541315,
        // it is treated by default as a double type (which is a 64-bit floating-point
        // number).However, the float type in Java is a 32-bit floating-point number,
        // so when you assign a decimal literal to a float variable, you must tell Java explicitly
        // that this number is a float — not a double. Without the f suffix,
        // you’d get a compiler error like:
        //“possible lossy conversion from double to float.”
        //So the f suffix safely converts the literal to float type.
        System.out.printf("Formatted Number: %.2f", num);
    }
}
