package school.sptech;

public class Main {

    public static void main(String[] args) {

        Time time = new Time("Rocha Sólida");
        time.registrarVitoria();
        time.registrarVitoria();
        time.registrarVitoria();
        time.registrarVitoria();

        time.registrarEmpate();
        time.registrarEmpate();
        time.registrarEmpate();

        time.registrarDerrota();
        time.registrarDerrota();
        time.registrarDerrota();
        time.registrarDerrota();
        time.registrarDerrota();
        time.registrarDerrota();
        time.registrarDerrota();
        time.registrarDerrota();
        time.registrarDerrota();
        time.registrarDerrota();

        time.exibirInformacoes();

        Time time2 = new Time("Fogo Ardente");

        time2.registrarVitoria();
        time2.registrarVitoria();
        time2.registrarVitoria();
        time2.registrarVitoria();

        time2.registrarEmpate();
        time2.registrarEmpate();
        time2.registrarEmpate();
        time2.registrarEmpate();
        time2.registrarEmpate();

        time2.registrarDerrota();
        time2.registrarDerrota();
        time2.registrarDerrota();
        time2.registrarDerrota();
        time2.registrarDerrota();
        time2.registrarDerrota();
        time2.registrarDerrota();
        time2.registrarDerrota();

        time2.exibirInformacoes();

        time.compararAproveitamento(time2);
    }
}