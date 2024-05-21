import java.util.Scanner;

// NOT DONE

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int total = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        
        for (int i = 0; i < N; i++) {
            int quantidade = sc.nextInt();
            String tipo = sc.next();
            
            total += quantidade;
            
            if (tipo.equals("C")) {
                coelhos += quantidade;
            } else if (tipo.equals("R")) {
                ratos += quantidade;
            } else if (tipo.equals("S")) {
                sapos += quantidade;
            }
        }
        
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        
        double percentualCoelhos = (coelhos * 100.0) / total;
        double percentualRatos = (ratos * 100.0) / total;
        double percentualSapos = (sapos * 100.0) / total;
        
        System.out.printf("Percentual de coelhos: %.2f%%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f%%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f%%%n", percentualSapos);
    }
}
