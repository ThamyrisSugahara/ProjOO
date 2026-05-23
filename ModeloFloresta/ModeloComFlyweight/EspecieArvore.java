class EspecieArvore {

    private final String especie;
    private final String textura;
    private final String sombra;
    private final String corFolha;
    private final String tipoCasca;

    public EspecieArvore(
            String especie,
            String textura,
            String sombra,
            String corFolha,
            String tipoCasca
    ) {

        this.especie = especie;
        this.textura = textura;
        this.sombra = sombra;
        this.corFolha = corFolha;
        this.tipoCasca = tipoCasca;
    }
}