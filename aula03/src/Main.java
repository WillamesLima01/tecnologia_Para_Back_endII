
import consulta.Consulta;
import paciente.Paciente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente("willames", "346545646", "30/07/2000", "83999587797");
        Consulta consulta = new Consulta("12/09/2000", "12:00", "jose", 100.00);

        System.out.println(paciente);
    }
}