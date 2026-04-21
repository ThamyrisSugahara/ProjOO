public class Configurar {
    private Configurar() {}

    private String NomeAplicacao = "Notificaador";
    private String Servidor = "Servidor";
    private Number NEnvio = 5;
    private String Informacoes;
    private static Configurar Instance;

    public static Configurar getInstance() {
        if (Instance == null) {
            Instance = new Configurar();
        }
        return Instance;
    }

    public String getNomeAplicacao() {
        return NomeAplicacao;
    }

    public Number getNEnvio() {
        return NEnvio;
    }

    public void ImprimeInformacoes() {
        System.out.println("Nome: " + getNomeAplicacao() + "\nTentativas de Envios: " + getNEnvio());
    }
}
