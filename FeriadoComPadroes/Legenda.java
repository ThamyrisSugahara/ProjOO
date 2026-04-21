class Legenda extends Decorator {
    public Legenda(Video v) { super(v); }

    public void assistir() {
        super.assistir();
        System.out.println("Legenda ativada");
    }
}