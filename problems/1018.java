import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int originalAmount = amount;

        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            count[i] = amount / notes[i];
            amount %= notes[i];
        }

        System.out.println(originalAmount);
        for (int i = 0; i < notes.length; i++) {
            System.out.printf("%d nota(s) de R$ %d,00\n", count[i], notes[i]);
        }

    }
}
