import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio06 {

    public static class Aluno {
        private String nome;
        private int[] notas;

        public Aluno(String nome, int nota1, int nota2, int nota3) {
            this.nome = nome;
            this.notas = new int[]{nota1, nota2, nota3};
        }

        public String getNome() {
            return nome;
        }

        public int[] getNotas() {
            return notas;
        }

        public double calcularMedia() {
            int soma = 0;
            for (int nota : notas) {
                soma += nota;
            }
            return soma / (double) notas.length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do aluno ou 'sair' para encerrar: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite a primeira nota: ");
            int nota1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite a segunda nota: ");
            int nota2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite a terceira nota: ");
            int nota3 = Integer.parseInt(scanner.nextLine());

            Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
            alunos.add(aluno);
        }

        // Imprimir notas e médias de todos os alunos
        System.out.println("Notas e médias dos alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Notas: " + aluno.getNotas()[0] + ", " + aluno.getNotas()[1] + ", " + aluno.getNotas()[2]);
            System.out.println("Média: " + aluno.calcularMedia());
            System.out.println();
        }

        // Calcular média geral da turma
        double mediaGeral = 0;
        for (Aluno aluno : alunos) {
            mediaGeral += aluno.calcularMedia();
        }
        mediaGeral /= alunos.size();
        System.out.println("Média geral da turma: " + mediaGeral);

        // Contar alunos aprovados e reprovados e imprimir seus nomes
        int aprovados = 0;
        int reprovados = 0;
        System.out.println("Alunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() >= 6) {
                System.out.println(aluno.getNome());
                aprovados++;
            } else {
                reprovados++;
            }
        }
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos reprovados: " + reprovados);

        scanner.close();
    }
}
