package avaliacao.formula1;


public class Piloto extends Pessoa {
    private int numeroVitorias;


    public Piloto(String nome, int idade, String nacionalidade, int numeroVitorias) {
        super(nome, idade, nacionalidade);
        this.numeroVitorias = numeroVitorias;
    }

    public int getNumeroVitorias() {
        return numeroVitorias;
    }

    public void setNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias;
    }



    public void exibirDados() {
        super.exibirDados();
        System.out.println("Vitórias: " + numeroVitorias);
    }
}