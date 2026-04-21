class HD extends Decorator {
    public HD(Video v) { super(v); }

    public void assistir() {
        super.assistir();
        System.out.println("HD ativado");
    }
}