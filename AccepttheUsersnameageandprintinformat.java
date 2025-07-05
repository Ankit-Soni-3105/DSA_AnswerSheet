import java.util.Scanner;

public class AccepttheUsersnameageandprintinformat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}


// difference between the nextLine() and nextInt()
//Java mein nextLine() aur nextInt() dono hi Scanner class ke methods hain, lekin ye user input ko alag tareeke se handle karte hain. nextInt() sirf next integer value read karta hai — jaise hi usko koi space ya Enter milta hai, woh wahi pe input lena rok deta hai. Lekin woh jo Enter dabane se newline character (\n) bachta hai, woh input buffer mein chhod deta hai. Is wajah se jab aap agla input lete ho, woh leftover newline galti se read ho sakta hai.
//Wahin nextLine() poori line ka text read karta hai, jab tak Enter nahi dabate — aur phir woh newline character ko hata deta hai. Isliye agar aap nextInt() aur nextLine() ko mix karte ho, toh kabhi kabhi problem ho jaati hai: nextLine() woh leftover newline ko read kar leta hai aur user se naya input nahi mangta. Is problem ko avoid karne ke liye, programmers aksar nextInt() ke baad ek extra nextLine() laga dete hain, taaki woh leftover newline consume ho jaaye.
//Seedhi baat mein: nextInt() sirf number read karne ke liye hai, aur nextLine() poori line read karne ke liye hai (space ke saath).