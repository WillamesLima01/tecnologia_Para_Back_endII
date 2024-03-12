import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma Palavra: ");
        String entrada = scanner.nextLine();

        String invertida = inverterString(entrada);
        System.out.println("A string invertida é: " + invertida);

        scanner.close();
    }

    public static String inverterString(String entrada) {
        StringBuilder invertida = new StringBuilder();

        for (int i = entrada.length() - 1; i >= 0; i--) {
            invertida.append(entrada.charAt(i));
        }

        return invertida.toString();
    }
}
