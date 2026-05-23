import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int TOTAL_ARVORES = 100000;
        int TOTAL_ESPECIES = 100;

        Arvore[] floresta = new Arvore[TOTAL_ARVORES];

        for (int i = 0; i < TOTAL_ARVORES; i++) {

            int especieId = random.nextInt(TOTAL_ESPECIES);

            EspecieArvore especie = FabricaEspecies.getEspecie(

                            "Especie_" + especieId,
                            "TEXTURA_4K_" + especieId,
                            "SOMBRA_" + especieId,
                            "VERDE_" + especieId,
                            "CASCATIPO_" + especieId
                    );

            floresta[i] = new Arvore(

                    10 + random.nextDouble() * 40,
                    0.5 + random.nextDouble() * 3,
                    random.nextInt(10000),
                    random.nextInt(10000),

                    random.nextInt(300),
                    random.nextDouble() * 45,
                    random.nextBoolean(),
                    random.nextInt(500),

                    especie
            );
        }

        /* calculo memória - mutáveis
            altura              8
            larguraTronco       8
            posX                4
            posY                4
            idade               4
            inclinacao          8
            possuiFrutos        1
            quantidadeGalhos    4
            referência          8

            49 bytes
        */

        int memoriaMutavel = 49;

        /* caculo memoria - imutáveis
            especie             40
            textura            200
            sombra             100
            corFolha            50
            tipoCasca           80

            470 bytes
        */

        int memoriaEspecie = 470;

        long memoriaTotal = (long) memoriaMutavel * TOTAL_ARVORES + (long) memoriaEspecie * TOTAL_ESPECIES;

        System.out.println("Memória total COM Flyweight: " + memoriaTotal + " bytes");

        double mb = memoriaTotal / (1024.0 * 1024.0);

        System.out.printf("Aproximadamente %.2f MB\n", mb);
    }
}