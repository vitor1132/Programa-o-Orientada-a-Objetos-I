package avaliacao.formula1;

public class Patrocinador {
    private String nome;
    private double valorPatrocinio;




    public Patrocinador(String nome, double valorPatrocinio) {
        this.nome = nome;
        this.valorPatrocinio = valorPatrocinio;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(double valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;

    }


    public void exibirDados() {
        System.out.println(nome + " - R$ " + String.format("%.2f", valorPatrocinio));
    }
}