package Biblioteca;

public class Livro extends Acervo {

    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        disponivel = true;
    }
}