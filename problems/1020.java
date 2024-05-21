import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);


    }
}
