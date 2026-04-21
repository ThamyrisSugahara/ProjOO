public class VideoFactory {
    public static Video criar(String tipo) {
        if (tipo.equalsIgnoreCase("filme")) {
            return new Filme();
        }
        return new Serie();
    }
}
