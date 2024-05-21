import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();

        int remainingAmount = (int) Math.round(amount * 100);

        int[] noteValues = {10000, 5000, 2000, 1000, 500, 200};
        int[] coinValues = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int value : noteValues) {
            int count = remainingAmount / value;
            remainingAmount %= value;
            System.out.printf("%d nota(s) de R$ %.2f\n", count, value / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int value : coinValues) {
            int count = remainingAmount / value;
            remainingAmount %= value;
            System.out.printf("%d moeda(s) de R$ %.2f\n", count, value / 100.0);
        }

    }
}
