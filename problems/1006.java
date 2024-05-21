import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double weightA = 2;
        double weightB = 3;
        double weightC = 5;
        double media = (a * weightA + b * weightB + c * weightC) / (weightA + weightB + weightC);

        System.out.printf("MEDIA = %.1f\n", media);
        
    }
}
