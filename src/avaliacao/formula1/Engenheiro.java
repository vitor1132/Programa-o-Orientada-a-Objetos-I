package avaliacao.formula1;


public class Engenheiro extends Pessoa {
    private Piloto pilotoTrabalho;




    public Engenheiro(String nome, int idade, String nacionalidade, Piloto pilotoTrabalho) {
        super(nome, idade, nacionalidade); // Chama o construtor da classe pai
        this.pilotoTrabalho = pilotoTrabalho;
    }




    public Piloto getPilotoTrabalho() {
        return pilotoTrabalho;
    }

    public void setPilotoTrabalho(Piloto pilotoTrabalho) {
        this.pilotoTrabalho = pilotoTrabalho;
    }



    public void exibirDados() {
        super.exibirDados();
        System.out.println("Trabalha com: " + pilotoTrabalho.getNome());
    }
}