import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            
            double weightedAverage = (num1 * 2 + num2 * 3 + num3 * 5) / 10.0;
            
            System.out.printf("%.1f%n", weightedAverage);
        }
    }
}
