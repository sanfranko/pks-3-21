import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int ddd = sc.nextInt();

        String city;
        if (ddd == 61) {
            city = "Brasilia";
        } else if (ddd == 71) {
            city = "Salvador";
        } else if (ddd == 11) {
            city = "Sao Paulo";
        } else if (ddd == 21) {
            city = "Rio de Janeiro";
        } else if (ddd == 32) {
            city = "Juiz de Fora";
        } else if (ddd == 19) {
            city = "Campinas";
        } else if (ddd == 27) {
            city = "Vitoria";
        } else if (ddd == 31) {
            city = "Belo Horizonte";
        } else {
            city = "DDD nao cadastrado";
        }

        System.out.println(city);
    }
}
