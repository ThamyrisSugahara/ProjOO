public class Config {
    private static Config instancia;
    private int qualidade = 720;

    private Config() {}

    public static Config getInstancia() {
        if (instancia == null) {
            instancia = new Config();
        }
        return instancia;
    }

    public int getQualidade() {
        return qualidade;
    }
}