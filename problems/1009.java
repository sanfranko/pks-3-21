import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sellerName = sc.nextLine();
        
        double fixedSalary = sc.nextDouble();
        double salesTotal = sc.nextDouble();
        double bonus = salesTotal * 0.15;
        double totalSalary = fixedSalary + bonus;
        
        System.out.printf("TOTAL = R$ %.2f\n", totalSalary);

    }
}
