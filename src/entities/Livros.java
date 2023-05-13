package entities;

public class Livros {
    private String titulo;
    private String autor;
    private int ano;
    private int idEditora;

    public Livros(String titulo, String autor, int ano, int idEditora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.idEditora = idEditora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdEditora() {
        return idEditora;
    }

    @Override
    public String toString() {
        return "Titulo do Livro: '" + titulo +
                "', autor: '" + autor  +
                "', ano: " + ano +
                ", idEditora = " + idEditora;
    }
}
