import java.util.Arrays;
import java.util.List;

public class exercicio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 6, 7, 8, 9);

        numeros.forEach(n -> System.out.println(n*n));
    }
}
