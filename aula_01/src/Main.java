import java.util.LongSummaryStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vlr = new Scanner(System.in);

        System.out.println("Informe o valor: ");

        int valor;

        valor = vlr.nextInt();

        for (int i = 1; i <= valor; i++) {

           for (int x = 1; x<=i;x++){
               System.out.print("+");
           }
            System.out.println();
        }
    }
}