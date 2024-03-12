import java.util.Random;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner valor = new Scanner(System.in);

        int vlrSorteado = random.nextInt(1001);
        int palpites = 0;
        int palpiteMin = 0;
        int palpiteMax = 1000;

        System.out.println("Foi sorteado um número entre 0 e 1000. Fale seu palpite e advinhe o número!");

        int palpite;
        do {
            System.out.print("Digite um número inteiro entre " + palpiteMin + " e " + palpiteMax + ": ");
            palpite = getValidPalpite(valor, palpiteMin, palpiteMax);
            palpites++;

            if (palpite < vlrSorteado) {
                palpiteMin = palpite;
                System.out.println("O número sorteado é maior que " + palpite + " e menor que " + palpiteMax + ".");
            } else if (palpite > vlrSorteado) {
                palpiteMax = palpite;
                System.out.println("O número sorteado é maior que " + palpiteMin + " e menor que " + palpite + ".");
            }
        } while (palpite != vlrSorteado);

        System.out.println("Parabéns! Você acertou o número " + vlrSorteado + " com " + palpites + " palpites.");

        valor.close();
    }

    private static int getValidPalpite(Scanner scanner, int min, int max) {
        int palpite;
        do {
            palpite = scanner.nextInt();
            if (palpite < min || palpite > max) {
                System.out.print("Digite um número válido entre " + min + " e " + max + ": ");
            }
        } while (palpite < min || palpite > max);
        return palpite;
    }
}
