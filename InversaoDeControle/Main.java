public class Main {
    public static void main(String[] args) {

        PDC pdc = new PDC();

        // Inversão de controle
        Universidade usp = new Universidade("UNIFESP");
        Universidade unicamp = new Universidade("UNICAMP");
        Universidade ufscar = new Universidade("USP");

        // Definindo interesses
        usp.adicionarInteresse(TipoVaga.INTERCAMBIO);
        usp.adicionarInteresse(TipoVaga.MESTRADO);

        unicamp.adicionarInteresse(TipoVaga.DOUTORADO);

        ufscar.adicionarInteresse(TipoVaga.INTERCAMBIO);

        // Registrando observadores
        pdc.adicionarObservador(usp);
        pdc.adicionarObservador(unicamp);
        pdc.adicionarObservador(ufscar);

        // Disparando eventos
        pdc.novaVaga("Bolsa na Europa", TipoVaga.INTERCAMBIO);

        System.out.println("\n---\n");

        pdc.novaVaga("Programa de Doutorado em IA", TipoVaga.DOUTORADO);

        System.out.println("\n---\n");

        pdc.novaVaga("Mestrado em Engenharia", TipoVaga.MESTRADO);
    }
}