package Lampada;

/* Representa uma lâmpada simples que pode estar ligada ou desligada
   e possui uma potência (watts) com validação. */
public class Lampada {

    /* A variável 'acesa' guarda o estado atual da lâmpada.
       Se for true, a lâmpada está ligada e se for false, está desligada. */
    private boolean acesa;

    /* A variável 'watts' representa a potência da lâmpada.
       Ela começa com valor padrão de 60 watts. */
    private int watts = 60;

    /* Este construtor recebe apenas o estado inicial da lâmpada.
       A potência permanece com o valor padrão (60W). */
    public Lampada(boolean estadoInicial) {
        this.acesa = estadoInicial;
    }

    /* Este construtor recebe o estado inicial e também a potência.
       A diferença para o outro construtor é que aqui usamos o método
       setWatts(), que valida se o valor está dentro do intervalo permitido. */
    public Lampada(boolean estadoInicial, int watts) {
        this.acesa = estadoInicial;
        setWatts(watts);
    }

    /* Método setWatts:
       Define a potência da lâmpada apenas se estiver entre 1 e 1000.
       Caso contrário, mostra uma mensagem de valor inválido. */
    public void setWatts(int watts) {
        if (watts >= 1 && watts <= 1000){
            this.watts = watts;
        } else {
            System.out.println("invalido");
        }
    }

    /* Método getWatts:
       Retorna o valor atual da potência da lâmpada. */
    public int getWatts(){
        return watts;
    }

    /* Alterna o estado da lâmpada (se estiver ligada, desliga;
       se estiver desligada, liga). */
    public void interruptor() {
        acesa = !acesa;

        if (acesa) {
            System.out.println("ligada.");
        } else {
            System.out.println("desligada.");
        }
    }

    /* Exibe no console o estado atual da lâmpada sem alterá-lo. */
    public void mostrarEstado() {
        if (acesa) {
            System.out.println("acesa.");
        } else {
            System.out.println("apagada.");
        }
    }

    /* Exibe a potência (watts) da lâmpada. */
    public void mostrarWatts() {
        System.out.println(watts);
    }
}