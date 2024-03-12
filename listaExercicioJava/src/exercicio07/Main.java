package exercicio07;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de cliente
        System.out.println("Cadastro de Cliente:");
        ClienteDTO cliente = new ClienteDTO();
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("CPF: ");
        cliente.setCpf(scanner.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(scanner.nextLine());
        System.out.print("Data de Nascimento (AAAA-MM-DD): ");
        cliente.setDataNascimento(LocalDate.parse(scanner.nextLine()));
        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());

        // Cadastro de livro
        System.out.println("\nCadastro de Livro:");
        LivroDTO livro = new LivroDTO();
        System.out.print("Nome do Livro: ");
        livro.setNome(scanner.nextLine());
        System.out.print("Autor: ");
        livro.setAutor(scanner.nextLine());
        System.out.print("Quantidade de Páginas: ");
        livro.setQuantidadePaginas(Integer.parseInt(scanner.nextLine()));
        System.out.print("Editora: ");
        livro.setEditora(scanner.nextLine());

        // Empréstimo de livro
        System.out.println("\nEmpréstimo de Livro:");
        EmprestimoDTO emprestimo = new EmprestimoDTO();
        emprestimo.setCliente(cliente);
        emprestimo.setLivro(livro);
        System.out.print("Data de Empréstimo (AAAA-MM-DD): ");
        emprestimo.setDataEmprestimo(LocalDate.parse(scanner.nextLine()));
        System.out.print("Data de Devolução Prevista (AAAA-MM-DD): ");
        emprestimo.setDataDevolucaoPrevista(LocalDate.parse(scanner.nextLine()));

        // Exibindo informações do empréstimo
        System.out.println("\nDetalhes do Empréstimo:");
        System.out.println("Cliente: " + emprestimo.getCliente().getNome());
        System.out.println("Livro: " + emprestimo.getLivro().getNome());
        System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data de Devolução Prevista: " + emprestimo.getDataDevolucaoPrevista());

        scanner.close();
    }
}
