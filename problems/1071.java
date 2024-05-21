import java.util.Scanner;

// NOT DONE

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }

        int sumOdd = 0;

        for (int num = X; num <= Y; num++) {
            if (num % 2 != 0) {
                sumOdd += num;
            }
        }

        System.out.println(sumOdd);
    }
}
