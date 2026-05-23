class ArvoreSemFlyweight {

    // mutaveis
    private double altura;
    private double larguraTronco;
    private int posX;
    private int posY;
    private int idade;
    private double inclinacao;
    private boolean possuiFrutos;
    private int quantidadeGalhos;

    // imutaveis
    private String especie;
    private String textura;
    private String sombra;
    private String corFolha;
    private String tipoCasca;

    public ArvoreSemFlyweight(
            double altura,
            double larguraTronco,
            int posX,
            int posY,
            int idade,
            double inclinacao,
            boolean possuiFrutos,
            int quantidadeGalhos,
            String especie,
            String textura,
            String sombra,
            String corFolha,
            String tipoCasca
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
        this.textura = textura;
        this.sombra = sombra;
        this.corFolha = corFolha;
        this.tipoCasca = tipoCasca;
    }
}