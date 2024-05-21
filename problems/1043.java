import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sides = new double[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = sc.nextDouble();
        }

        Arrays.sort(sides);

        double a = sides[2];
        double b = sides[1];
        double c = sides[0];

        if (a < b + c) {
            double perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimeter);
        } else {
            double area = (a + b) * c / 2.0;
            System.out.printf("Area = %.1f\n", area);
        }

    }
}
