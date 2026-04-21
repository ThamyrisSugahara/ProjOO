public class StreamingFacade {

    public void assistir(String tipo, boolean premium) {
        Video video = VideoFactory.criar(tipo);

        video = new Proxy(video, premium);
        video = new Legenda(video);
        video = new HD(video);

        video.assistir();

        PlayerAdapter player = new PlayerAdapter();
        player.play(tipo);
    }
}