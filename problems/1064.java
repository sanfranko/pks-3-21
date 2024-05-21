import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double sumPositive = 0;
        int countPositive = 0;

        for (int i = 0; i < 6; i++) {
            double num = sc.nextDouble();
            if (num > 0) {
                countPositive++;
                sumPositive += num;
            }
        }

        System.out.println(countPositive + " valores positivos");

        if (countPositive > 0) {
            double averagePositive = sumPositive / countPositive;
            System.out.printf("%.1f\n", averagePositive);
        }
    }
}
