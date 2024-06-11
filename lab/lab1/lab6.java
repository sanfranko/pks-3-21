package Tasks.lab1;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес на Земле в кг: ");
        double weightOnEarth = scanner.nextDouble();

        final double MOON_GRAVITY_RATIO = 0.165;
        final double ANNUAL_INCREASE_PERCENTAGE = 3.2 / 100;

        System.out.println("Результаты:");
        for (int year = 1; year <= 15; year++) {
            double weightOnMoon = weightOnEarth * MOON_GRAVITY_RATIO;
            System.out.printf("%d год: %.3f кг%n", year, weightOnMoon);

            weightOnEarth *= (1 + ANNUAL_INCREASE_PERCENTAGE);
        }

        scanner.close();
    }
}