import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        int sair = 1;

        while (sair != 0) {
            Scanner valor = new Scanner(System.in);
            System.out.println("Digite um valor inteiro: ");
            int vlr = valor.nextInt();
            sair = vlr;

            if (sair != 0) {
                boolean primo = true;

                for(int i = 2; i < vlr; i++) {
                    if(vlr % i == 0) {
                        primo = false;
                    }
                }

                if (primo) {
                    System.out.println("O número " + vlr + " é primo!");
                } else {
                    System.out.println("O número " + vlr + " não é primo!");
                }
            }
        }

    }
}
