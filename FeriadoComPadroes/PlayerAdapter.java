public class PlayerAdapter {
    private PlayerExterno externo = new PlayerExterno();

    public void play(String tipo) {
        if (tipo.equals("filme")) {
            externo.rodar("mp4");
        } else {
            externo.rodar("mkv");
        }
    }
}