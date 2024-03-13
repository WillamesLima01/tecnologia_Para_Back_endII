import java.util.Arrays;
import java.util.List;

public class exercicio01 {

    public static void main(String[] args) {
        List<Integer>List = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (Integer n: List) {
            System.out.println(n);
        }

        List.forEach(n -> System.out.println(n));
    }

}
