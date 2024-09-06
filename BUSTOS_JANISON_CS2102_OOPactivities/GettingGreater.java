import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);

        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);

        char greaterChar = (char) Math.max(ch1, ch2);

        System.out.println("\nThe character with the greater value is: " + greaterChar);
        System.out.println("ASCII value of " + ch1 + " is: " + (int) ch1);
        System.out.println("ASCII value of " + ch2 + " is: " + (int) ch2);

        scanner.close();
    }
}
