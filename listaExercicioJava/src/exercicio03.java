import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String iniciais = extrairIniciais(nomeCompleto);
        System.out.println("As iniciais do nome são: " + iniciais);

        scanner.close();
    }

    public static String extrairIniciais(String nomeCompleto) {
        String[] partesNome = nomeCompleto.split("\\s+");
        StringBuilder iniciais = new StringBuilder();

        for (String parte : partesNome) {
            if (!parte.isEmpty()) {
                iniciais.append(parte.charAt(0)).append(".");
            }
        }

        return iniciais.toString().toUpperCase(); // Converte para maiúsculas antes de retornar
    }
}

