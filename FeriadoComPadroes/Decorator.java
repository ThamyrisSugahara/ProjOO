public class Decorator implements Video {
    protected Video video;

    public Decorator(Video video) {
        this.video = video;
    }

    public void assistir() {
        video.assistir();
    }
}