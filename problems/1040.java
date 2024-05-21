import java.util.Scanner;

// NOT DONE

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double average = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10.0;

        System.out.printf("Media: %.1f\n", average);

        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double examGrade = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", examGrade);

            double finalAverage = (average + examGrade) / 2.0;

            if (finalAverage >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", finalAverage);
        }

    }
}
