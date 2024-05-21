import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        double a = sc.nextDouble();        
        double b = sc.nextDouble();
        
        double weightA = 3.5;
        double weightB = 7.5;
        double media = (a * weightA + b * weightB) / (weightA + weightB);
        
        System.out.printf("MEDIA = %.5f\n", media);

    }
}
