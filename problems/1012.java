import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pi = 3.14159;
        double areaTriangle = (A * C) / 2;
        double areaCircle = pi * Math.pow(C, 2);
        double areaTrapezoid = ((A + B) * C) / 2;
        double areaSquare = B * B;
        double areaRectangle = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangle);
        System.out.printf("CIRCULO: %.3f\n", areaCircle);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezoid);
        System.out.printf("QUADRADO: %.3f\n", areaSquare);
        System.out.printf("RETANGULO: %.3f\n", areaRectangle);

    }
}