package list.Pesquisa;

public class Livro {
    //atributos
    private String titurlo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titurlo, String autor, int anoPublicacao) {
        this.titurlo = titurlo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTiturlo() {
        return titurlo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titurlo='" + titurlo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
