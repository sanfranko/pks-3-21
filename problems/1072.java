import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int inInterval = 0;
        int outInterval = 0;
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                inInterval++;
            } else {
                outInterval++;
            }
        }
        System.out.println(inInterval + " in");
        System.out.println(outInterval + " out");
    }
}
