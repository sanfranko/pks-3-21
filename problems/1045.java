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

        if (sides[2] >= sides[0] + sides[1]) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1]) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (sides[2] * sides[2] > sides[0] * sides[0] + sides[1] * sides[1]) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (sides[2] * sides[2] < sides[0] * sides[0] + sides[1] * sides[1]) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (sides[0] == sides[1] && sides[1] == sides[2]) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((sides[0] == sides[1] && sides[1] != sides[2]) || (sides[0] != sides[1] && sides[1] == sides[2])) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
