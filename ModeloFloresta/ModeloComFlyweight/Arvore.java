class Arvore {

    // mutáveis
    private double altura;
    private double larguraTronco;
    private int posX;
    private int posY;
    private int idade;
    private double inclinacao;
    private boolean possuiFrutos;
    private int quantidadeGalhos;

    // ref compartilhada
    private EspecieArvore especie;

    public Arvore(
            double altura,
            double larguraTronco,
            int posX,
            int posY,
            int idade,
            double inclinacao,
            boolean possuiFrutos,
            int quantidadeGalhos,
            EspecieArvore especie
    ) {

        this.altura = altura;
        this.larguraTronco = larguraTronco;
        this.posX = posX;
        this.posY = posY;

        this.idade = idade;
        this.inclinacao = inclinacao;
        this.possuiFrutos = possuiFrutos;
        this.quantidadeGalhos = quantidadeGalhos;

        this.especie = especie;
    }
}