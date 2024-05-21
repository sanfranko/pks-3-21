import java.util.Scanner;

// NOT DONE

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.next();
        int day1 = sc.nextInt();
        sc.next();
        int hour1 = sc.nextInt();
        sc.next();
        int minute1 = sc.nextInt();
        sc.next();
        int second1 = sc.nextInt();

        sc.next(); 
        int day2 = sc.nextInt();
        sc.next(); 
        int hour2 = sc.nextInt();
        sc.next(); 
        int minute2 = sc.nextInt();
        sc.next(); 
        int second2 = sc.nextInt();

        int totalSeconds1 = (day1 * 24 * 60 * 60) + (hour1 * 60 * 60) + (minute1 * 60) + second1;
        int totalSeconds2 = (day2 * 24 * 60 * 60) + (hour2 * 60 * 60) + (minute2 * 60) + second2;

        int differenceSeconds = totalSeconds2 - totalSeconds1;

        int days = differenceSeconds / (24 * 60 * 60);
        differenceSeconds %= (24 * 60 * 60);
        int hours = differenceSeconds / (60 * 60);
        differenceSeconds %= (60 * 60);
        int minutes = differenceSeconds / 60;
        int seconds = differenceSeconds % 60;

        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
    }
}
