import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productCode = sc.nextInt();
        int productQuantity = sc.nextInt();
        double productPrice = sc.nextDouble();
        
        int productCode2 = sc.nextInt();
        int productQuantity2 = sc.nextInt();
        double productPrice2 = sc.nextDouble();
        
        double totalCost = (productQuantity * productPrice) + (productQuantity2 * productPrice2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalCost);

    }
}
