import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int maxPos = 0;
        
        for (int i = 1; i <= 100; i++) {
            int num = sc.nextInt();
            
            if (num > max) {
                max = num;
                maxPos = i;
            }
        }
        
        System.out.println(max);
        System.out.println(maxPos);
    }
}
