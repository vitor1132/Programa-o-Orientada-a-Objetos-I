package avaliacao.formula1;

public class Equipe {
    private String nome;
    private int anoFundacao;
    private Patrocinador[] patrocinadores;

    public Equipe(String nome, int anoFundacao, Patrocinador[] patrocinadores) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.patrocinadores = patrocinadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Patrocinador[] getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(Patrocinador[] patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public void exibirDados() {
        System.out.println("Equipe: " + nome);
        System.out.println("Fundação: " + anoFundacao);
        System.out.println("Patrocinadores:");

        for (Patrocinador p : patrocinadores) {
            System.out.print("  - ");
            p.exibirDados();
        }
    }
}