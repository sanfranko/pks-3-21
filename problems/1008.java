import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int hoursWorked = sc.nextInt();
        
        double hourlyRate = sc.nextDouble();
        double salary = hoursWorked * hourlyRate;
        
        System.out.println("NUMBER = " + employeeNumber);
        
        System.out.printf("SALARY = U$ %.2f\n", salary);

    }
}
