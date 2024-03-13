import java.util.Scanner;

public class exercicio02 {

        interface Calculadora {
            int calculadora(int a, int b);
        }

        public static void main(String[] args) {
            Calculadora somar = Integer::sum;

            Calculadora subtrair = (a, b) -> a-b;

            Calculadora multiplicar = (a, b) -> a*b;

            Calculadora dividir = (a, b) -> a/b;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe o primeiro valor: ");
            int valor1 = entrada.nextInt();

            System.out.println("Informe o segundo valor: ");
            int valor2 = entrada.nextInt();

            int resultado = somar.calculadora(valor1, valor2);
            System.out.println("Soma: " + resultado);

            resultado = subtrair.calculadora(valor1, valor2);
            System.out.println("Subtrair: " + resultado);

            resultado = multiplicar.calculadora(valor1, valor2);
            System.out.println("Multiplicação: " + resultado);

            resultado = dividir.calculadora(valor1, valor2);
            System.out.println("Divisão: " + resultado);

        }

}
