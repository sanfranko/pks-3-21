import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();

        String month;
        if (mes == 1) {
            month = "January";
        } else if (mes == 2) {
            month = "February";
        } else if (mes == 3) {
            month = "March";
        } else if (mes == 4) {
            month = "April";
        } else if (mes == 5) {
            month = "May";
        } else if (mes == 6) {
            month = "June";
        } else if (mes == 7) {
            month = "July";
        } else if (mes == 8) {
            month = "August";
        } else if (mes == 9) {
            month = "September";
        } else if (mes == 10) {
            month = "October";
        } else if (mes == 11) {
            month = "November";
        } else if (mes == 12) {
            month = "December";
        } else {
            month = "Invalid";
        }

        System.out.println(month);
    }
}
