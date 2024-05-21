import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countPositive = 0;
        for (int i = 0; i < 6; i++) {
            double num = sc.nextDouble();
            if (num > 0) {
                countPositive++;
            }
        }

        System.out.println(countPositive + " valores positivos");
    }
}
