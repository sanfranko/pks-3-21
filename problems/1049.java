import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Считываем тип, класс и подкласс животного
        String tipo = sc.nextLine();
        String classe = sc.nextLine();
        String subclasse = sc.nextLine();

        // Определяем животное по его характеристикам
        String animal = "";
        if (tipo.equals("vertebrado")) {
            if (classe.equals("ave")) {
                if (subclasse.equals("carnivoro")) {
                    animal = "aguia";
                } else if (subclasse.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (classe.equals("mamifero")) {
                if (subclasse.equals("onivoro")) {
                    animal = "homem";
                } else if (subclasse.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (tipo.equals("invertebrado")) {
            if (classe.equals("inseto")) {
                if (subclasse.equals("hematofago")) {
                    animal = "pulga";
                } else if (subclasse.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (classe.equals("anelideo")) {
                if (subclasse.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (subclasse.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        // Выводим результат
        System.out.println(animal);
    }
}
