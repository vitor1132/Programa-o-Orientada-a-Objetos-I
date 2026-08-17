package Estudante;

public class Estudante {

    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    public void insereNotas(double n1, double n2,double n3,double n4,double n5) {
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
        notas[3] = n4;
        notas[4] = n5;
    }

    public double calculaMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
    }
        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public double menorNota() {
        double menor = notas[0];

        for (double nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }

        return menor;
    }
}
