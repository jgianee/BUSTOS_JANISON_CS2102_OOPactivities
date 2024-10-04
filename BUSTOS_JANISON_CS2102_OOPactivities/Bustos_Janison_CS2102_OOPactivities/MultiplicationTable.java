import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number for the multiplication table: ");
        int max = scanner.nextInt();

        int[][] table = new int[max + 1][max + 1];

        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= max; j++) {
                table[i][j] = i * j;
            }
        }

        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= max; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}