import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double radius = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * radius * radius;

        System.out.printf("A=%.4f\n", area);

    }
}
