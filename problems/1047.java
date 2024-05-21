import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        int durationMinutes;
        if (startHour == endHour && startMinute == endMinute) {
            durationMinutes = 24 * 60; 
        } else {
            durationMinutes = ((endHour * 60 + endMinute) - (startHour * 60 + startMinute) + 24 * 60) % (24 * 60);
        }

        int durationHours = durationMinutes / 60;
        durationMinutes %= 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHours, durationMinutes);
    }
}
