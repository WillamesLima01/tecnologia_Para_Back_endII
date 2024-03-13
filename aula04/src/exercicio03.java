import java.util.List;

public class exercicio03 {

    public static void main(String[] args) {
        List<String> nomes = List.of(
                "José",
                "Maria",
                "Tereza",
                "Pedro",
                "João",
                "Manassés",
                "Marcelo",
                "Tiago",
                "Angela",
                "Madalena");

        nomes.forEach(n -> System.out.println(n.startsWith("M") ? n: ""));
    }
}
