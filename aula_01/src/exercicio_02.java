import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args) {
        Scanner vlr = new Scanner(System.in);
         List<String> notas = new ArrayList<>();

         for (int i = 1; i <= 3; i++){

             System.out.printf("Informe o valor %d : ", i);
             notas.add(String.valueOf(vlr));

         }

        int valor = vlr.nextInt();

    }
}
