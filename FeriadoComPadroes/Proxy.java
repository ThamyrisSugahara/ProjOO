public class Proxy implements Video {
    private Video video;
    private boolean premium;

    public Proxy(Video video, boolean premium) {
        this.video = video;
        this.premium = premium;
    }

    public void assistir() {
        if (premium) {
            video.assistir();
        } else {
            System.out.println("Acesso negado");
        }
    }
}
