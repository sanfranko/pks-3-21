import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aTime = sc.nextInt();
        int bAvgSpeed = sc.nextInt();

        int distance = aTime * bAvgSpeed;
        double avgSpeed = 12.0;
        double litr = distance / avgSpeed;



        System.out.printf("%.3f\n", litr);
    }
}