package avaliacao.formula1;

public class TesteFormula1 {
    public static void main(String[] args) {


        Patrocinador p1 = new Patrocinador("Pudim", 15000000.00);
        Patrocinador p2 = new Patrocinador("Petrobras", 12000000.00);
        Patrocinador p3 = new Patrocinador("Mobil 1", 10000000.00);
        Patrocinador p4 = new Patrocinador("Rolex", 8000000.00);
        Patrocinador p5 = new Patrocinador("Pirelli", 9500000.00);

        Patrocinador[] patrocinadoresFerrari = {p1, p4};
        Patrocinador[] patrocinadoresMcLaren = {p2, p5};
        Patrocinador[] patrocinadoresRedBull = {p3, p1, p4};

        Equipe ferrari = new Equipe("Ferrari", 1947, patrocinadoresFerrari);
        Equipe mclaren = new Equipe("McLaren", 1963, patrocinadoresMcLaren);
        Equipe redBull = new Equipe("redBull", 2005, patrocinadoresRedBull);


        Piloto piloto1 = new Piloto("Charles Leclerc", 26, "Monegasco", 5);
        Piloto piloto2 = new Piloto("pudim", 24, "Britânico", 1);
        Piloto piloto3 = new Piloto("Max Verstappen", 26, "Holandês", 45);


        Engenheiro eng1 = new Engenheiro("Ricardo Adami", 45, "Italiano", piloto1);
        Engenheiro eng2 = new Engenheiro("Will Joseph", 42, "Britânico", piloto2);
        Engenheiro eng3 = new Engenheiro("Gianpiero Lambiase", 48, "Italiano", piloto3);

        CarroF1 carro1 = new CarroF1(16, 2, ferrari, piloto1);
        CarroF1 carro2 = new CarroF1(4, 3, mclaren, piloto2);
        CarroF1 carro3 = new CarroF1(1, 1, redBull, piloto3);

        System.out.println("FÓRMULA 1\n");

        carro1.exibirDados();
        System.out.println("\n\n");

        carro2.exibirDados();
        System.out.println("\n\n");

        carro3.exibirDados();


        System.out.println("\nENGENHEIROS\n");

        System.out.println("Engenheiro da Ferrari:");
        eng1.exibirDados();

        System.out.println("\nEngenheiro da McLaren:");
        eng2.exibirDados();

        System.out.println("\nEngenheiro da Red Bull:");
        eng3.exibirDados();
    }
}