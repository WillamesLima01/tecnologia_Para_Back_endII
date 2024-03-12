import java.util.Scanner;
import java.util.Arrays;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int[] valoresLetras = obterValoresLetras(palavra);
        System.out.println("Array: " + Arrays.toString(valoresLetras));

        // Ordena o array de valores das letras em ordem crescente
        Arrays.sort(valoresLetras);
        System.out.println("Array ordenado: " + Arrays.toString(valoresLetras));

        // Cria uma nova palavra com as letras na nova ordem
        String palavraOrdenada = reorganizarPalavra(palavra, valoresLetras);
        System.out.println("Saída: " + palavraOrdenada);

        scanner.close();
    }

    public static int[] obterValoresLetras(String palavra) {
        int[] valores = new int[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            // Obtém o valor do caractere na tabela ASCII e armazena no array
            valores[i] = (int) letra;
        }
        return valores;
    }

    public static String reorganizarPalavra(String palavra, int[] valores) {
        StringBuilder palavraOrdenada = new StringBuilder();
        for (int valor : valores) {
            // Obtém o caractere correspondente ao valor na tabela ASCII
            char letra = (char) valor;
            palavraOrdenada.append(letra);
        }
        return palavraOrdenada.toString();
    }
}
