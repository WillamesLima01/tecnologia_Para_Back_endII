package exercicio07;

public class LivroDTO {
    private String nome;
    private String autor;
    private int quantidadePaginas;
    private String editora;

    public LivroDTO(String nome, String autor, int quantidadePaginas, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.quantidadePaginas = quantidadePaginas;
        this.editora = editora;
    }

    public LivroDTO() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
