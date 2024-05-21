import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int count = 0;
        int current = X;
        while (count < 6) {
            if (current % 2 != 0) {
                System.out.println(current);
                count++;
            }
            current++;
        }
    }
}
