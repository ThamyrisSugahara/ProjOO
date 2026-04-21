public class Main {
    public static void main(String[] args) {
        Config config = Config.getInstancia();
        System.out.println("Qualidade: " + config.getQualidade());

        StreamingFacade facade = new StreamingFacade();

        facade.assistir("filme", true);
        System.out.println();
        facade.assistir("serie", false);
    }
}